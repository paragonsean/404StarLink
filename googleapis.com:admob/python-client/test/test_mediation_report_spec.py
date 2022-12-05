# coding: utf-8

"""
    AdMob API

    The AdMob API allows publishers to programmatically get information about their AdMob account. 

    The version of the OpenAPI document: v1beta
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mediation_report_spec import MediationReportSpec

class TestMediationReportSpec(unittest.TestCase):
    """MediationReportSpec unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MediationReportSpec:
        """Test MediationReportSpec
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MediationReportSpec`
        """
        model = MediationReportSpec()
        if include_optional:
            return MediationReportSpec(
                date_range = openapi_client.models.date_range.DateRange(
                    end_date = openapi_client.models.date.Date(
                        day = 56, 
                        month = 56, 
                        year = 56, ), 
                    start_date = openapi_client.models.date.Date(
                        day = 56, 
                        month = 56, 
                        year = 56, ), ),
                dimension_filters = [
                    openapi_client.models.mediation_report_spec_dimension_filter.MediationReportSpecDimensionFilter(
                        dimension = 'DIMENSION_UNSPECIFIED', 
                        matches_any = openapi_client.models.string_list.StringList(
                            values = [
                                ''
                                ], ), )
                    ],
                dimensions = [
                    'DIMENSION_UNSPECIFIED'
                    ],
                localization_settings = openapi_client.models.localization_settings.LocalizationSettings(
                    currency_code = '', 
                    language_code = '', ),
                max_report_rows = 56,
                metrics = [
                    'METRIC_UNSPECIFIED'
                    ],
                sort_conditions = [
                    openapi_client.models.mediation_report_spec_sort_condition.MediationReportSpecSortCondition(
                        dimension = 'DIMENSION_UNSPECIFIED', 
                        metric = 'METRIC_UNSPECIFIED', 
                        order = 'SORT_ORDER_UNSPECIFIED', )
                    ],
                time_zone = ''
            )
        else:
            return MediationReportSpec(
        )
        """

    def testMediationReportSpec(self):
        """Test MediationReportSpec"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
