# coding: utf-8

"""
    Migration Center API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.list_report_configs_response import ListReportConfigsResponse

class TestListReportConfigsResponse(unittest.TestCase):
    """ListReportConfigsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListReportConfigsResponse:
        """Test ListReportConfigsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListReportConfigsResponse`
        """
        model = ListReportConfigsResponse()
        if include_optional:
            return ListReportConfigsResponse(
                next_page_token = '',
                report_configs = [
                    openapi_client.models.report_config.ReportConfig(
                        create_time = '', 
                        description = '', 
                        display_name = '', 
                        group_preferenceset_assignments = [
                            openapi_client.models.report_config_group_preference_set_assignment.ReportConfigGroupPreferenceSetAssignment(
                                group = '', 
                                preference_set = '', )
                            ], 
                        name = '', 
                        update_time = '', )
                    ],
                unreachable = [
                    ''
                    ]
            )
        else:
            return ListReportConfigsResponse(
        )
        """

    def testListReportConfigsResponse(self):
        """Test ListReportConfigsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
