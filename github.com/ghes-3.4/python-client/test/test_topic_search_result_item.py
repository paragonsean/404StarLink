# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.topic_search_result_item import TopicSearchResultItem

class TestTopicSearchResultItem(unittest.TestCase):
    """TopicSearchResultItem unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TopicSearchResultItem:
        """Test TopicSearchResultItem
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TopicSearchResultItem`
        """
        model = TopicSearchResultItem()
        if include_optional:
            return TopicSearchResultItem(
                aliases = [
                    openapi_client.models.topic_search_result_item_aliases_inner.topic_search_result_item_aliases_inner(
                        topic_relation = openapi_client.models.topic_search_result_item_aliases_inner_topic_relation.topic_search_result_item_aliases_inner_topic_relation(
                            id = 56, 
                            name = '', 
                            relation_type = '', 
                            topic_id = 56, ), )
                    ],
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                created_by = '',
                curated = True,
                description = '',
                display_name = '',
                featured = True,
                logo_url = '',
                name = '',
                related = [
                    openapi_client.models.topic_search_result_item_aliases_inner.topic_search_result_item_aliases_inner(
                        topic_relation = openapi_client.models.topic_search_result_item_aliases_inner_topic_relation.topic_search_result_item_aliases_inner_topic_relation(
                            id = 56, 
                            name = '', 
                            relation_type = '', 
                            topic_id = 56, ), )
                    ],
                released = '',
                repository_count = 56,
                score = 1.337,
                short_description = '',
                text_matches = [
                    openapi_client.models.search_result_text_matches_inner.search_result_text_matches_inner(
                        fragment = '', 
                        matches = [
                            openapi_client.models.search_result_text_matches_inner_matches_inner.search_result_text_matches_inner_matches_inner(
                                indices = [
                                    56
                                    ], 
                                text = '', )
                            ], 
                        object_type = '', 
                        object_url = '', 
                        property = '', )
                    ],
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f')
            )
        else:
            return TopicSearchResultItem(
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                created_by = '',
                curated = True,
                description = '',
                display_name = '',
                featured = True,
                name = '',
                released = '',
                score = 1.337,
                short_description = '',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
        )
        """

    def testTopicSearchResultItem(self):
        """Test TopicSearchResultItem"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
