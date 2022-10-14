# coding: utf-8

"""
    Cloud Spanner API

    Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.result_set_stats import ResultSetStats

class TestResultSetStats(unittest.TestCase):
    """ResultSetStats unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ResultSetStats:
        """Test ResultSetStats
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ResultSetStats`
        """
        model = ResultSetStats()
        if include_optional:
            return ResultSetStats(
                query_plan = openapi_client.models.query_plan.QueryPlan(
                    plan_nodes = [
                        openapi_client.models.plan_node.PlanNode(
                            child_links = [
                                openapi_client.models.child_link.ChildLink(
                                    child_index = 56, 
                                    type = '', 
                                    variable = '', )
                                ], 
                            display_name = '', 
                            execution_stats = {
                                'key' : null
                                }, 
                            index = 56, 
                            kind = 'KIND_UNSPECIFIED', 
                            metadata = {
                                'key' : null
                                }, 
                            short_representation = openapi_client.models.short_representation.ShortRepresentation(
                                description = '', 
                                subqueries = {
                                    'key' : 56
                                    }, ), )
                        ], ),
                query_stats = {
                    'key' : null
                    },
                row_count_exact = '',
                row_count_lower_bound = ''
            )
        else:
            return ResultSetStats(
        )
        """

    def testResultSetStats(self):
        """Test ResultSetStats"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
