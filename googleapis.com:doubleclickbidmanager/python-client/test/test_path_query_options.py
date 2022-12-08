# coding: utf-8

"""
    DoubleClick Bid Manager API

    DoubleClick Bid Manager API allows users to manage and create campaigns and reports.

    The version of the OpenAPI document: v2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.path_query_options import PathQueryOptions

class TestPathQueryOptions(unittest.TestCase):
    """PathQueryOptions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PathQueryOptions:
        """Test PathQueryOptions
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PathQueryOptions`
        """
        model = PathQueryOptions()
        if include_optional:
            return PathQueryOptions(
                channel_grouping = openapi_client.models.channel_grouping.ChannelGrouping(
                    fallback_name = '', 
                    name = '', 
                    rules = [
                        openapi_client.models.rule.Rule(
                            disjunctive_match_statements = [
                                openapi_client.models.disjunctive_match_statement.DisjunctiveMatchStatement(
                                    event_filters = [
                                        openapi_client.models.event_filter.EventFilter(
                                            dimension_filter = openapi_client.models.path_query_options_filter.PathQueryOptionsFilter(
                                                filter = '', 
                                                match = 'UNKNOWN', 
                                                values = [
                                                    ''
                                                    ], ), )
                                        ], )
                                ], 
                            name = '', )
                        ], ),
                path_filters = [
                    openapi_client.models.path_filter.PathFilter(
                        event_filters = [
                            openapi_client.models.event_filter.EventFilter(
                                dimension_filter = openapi_client.models.path_query_options_filter.PathQueryOptionsFilter(
                                    filter = '', 
                                    match = 'UNKNOWN', 
                                    values = [
                                        ''
                                        ], ), )
                            ], 
                        path_match_position = 'PATH_MATCH_POSITION_UNSPECIFIED', )
                    ]
            )
        else:
            return PathQueryOptions(
        )
        """

    def testPathQueryOptions(self):
        """Test PathQueryOptions"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
