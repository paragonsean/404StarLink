# coding: utf-8

"""
    DoubleClick Bid Manager API

    DoubleClick Bid Manager API allows users to manage and create campaigns and reports.

    The version of the OpenAPI document: v2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.rule import Rule

class TestRule(unittest.TestCase):
    """Rule unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Rule:
        """Test Rule
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Rule`
        """
        model = Rule()
        if include_optional:
            return Rule(
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
                name = ''
            )
        else:
            return Rule(
        )
        """

    def testRule(self):
        """Test Rule"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
