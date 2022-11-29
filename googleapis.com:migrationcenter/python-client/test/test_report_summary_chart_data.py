# coding: utf-8

"""
    Migration Center API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.report_summary_chart_data import ReportSummaryChartData

class TestReportSummaryChartData(unittest.TestCase):
    """ReportSummaryChartData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ReportSummaryChartData:
        """Test ReportSummaryChartData
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ReportSummaryChartData`
        """
        model = ReportSummaryChartData()
        if include_optional:
            return ReportSummaryChartData(
                data_points = [
                    openapi_client.models.report_summary_chart_data_data_point.ReportSummaryChartDataDataPoint(
                        label = '', 
                        value = 1.337, )
                    ]
            )
        else:
            return ReportSummaryChartData(
        )
        """

    def testReportSummaryChartData(self):
        """Test ReportSummaryChartData"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
