package org.yes.cart.domain.query.impl;

import org.apache.commons.lang.StringUtils;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.TermQuery;
import org.yes.cart.domain.query.ProductSearchQueryBuilder;

import java.util.List;

/**
 * Query builder to create query to search by tag values
 * User: igora Igor Azarny
 * Date: 22-apr-12
 * Time: 6:08 PM
 */
public class TagSearchQueryBuilder implements ProductSearchQueryBuilder {


    /**
     * Create boolean query for search by tag value in given categories
     *
     * @param categories given categories
     * @param tagvalue   singe tag value
     * @return boolean query to perform search.
     */
    public BooleanQuery createQuery(final List<Long> categories, final String tagvalue) {
        BooleanQuery query = new BooleanQuery();
        if (StringUtils.isNotBlank(tagvalue)) {
            if (categories == null || (categories.size() == 1 && categories.get(0) == 0 ) ) {

                BooleanQuery currentQuery = new BooleanQuery();
                currentQuery.add(new TermQuery(new Term(PRODUCT_TAG_FIELD, tagvalue)),
                        BooleanClause.Occur.MUST
                );
                query.add(currentQuery, BooleanClause.Occur.SHOULD);

            } else {
                for (Long category : categories) {
                    BooleanQuery currentQuery = new BooleanQuery();
                    currentQuery.add(new TermQuery(new Term(PRODUCT_CATEGORY_FIELD, category.toString())),
                            BooleanClause.Occur.MUST
                    );
                    currentQuery.add(new TermQuery(new Term(PRODUCT_TAG_FIELD, tagvalue)),
                            BooleanClause.Occur.MUST
                    );
                    query.add(currentQuery, BooleanClause.Occur.SHOULD);
                }

            }
        }
        return query;
    }


}