# coding: utf-8

"""
    AdMob API

    The AdMob API allows publishers to programmatically get information about their AdMob account. 

    The version of the OpenAPI document: v1beta
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mediation_report_spec_dimension_filter import MediationReportSpecDimensionFilter

class TestMediationReportSpecDimensionFilter(unittest.TestCase):
    """MediationReportSpecDimensionFilter unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MediationReportSpecDimensionFilter:
        """Test MediationReportSpecDimensionFilter
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MediationReportSpecDimensionFilter`
        """
        model = MediationReportSpecDimensionFilter()
        if include_optional:
            return MediationReportSpecDimensionFilter(
                dimension = 'DIMENSION_UNSPECIFIED',
                matches_any = openapi_client.models.string_list.StringList(
                    values = [
                        ''
                        ], )
            )
        else:
            return MediationReportSpecDimensionFilter(
        )
        """

    def testMediationReportSpecDimensionFilter(self):
        """Test MediationReportSpecDimensionFilter"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
