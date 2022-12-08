# coding: utf-8

"""
    DoubleClick Bid Manager API

    DoubleClick Bid Manager API allows users to manage and create campaigns and reports.

    The version of the OpenAPI document: v2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.report_key import ReportKey

class TestReportKey(unittest.TestCase):
    """ReportKey unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ReportKey:
        """Test ReportKey
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ReportKey`
        """
        model = ReportKey()
        if include_optional:
            return ReportKey(
                query_id = '',
                report_id = ''
            )
        else:
            return ReportKey(
        )
        """

    def testReportKey(self):
        """Test ReportKey"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
