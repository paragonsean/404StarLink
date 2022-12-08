# coding: utf-8

"""
    DoubleClick Bid Manager API

    DoubleClick Bid Manager API allows users to manage and create campaigns and reports.

    The version of the OpenAPI document: v2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.list_reports_response import ListReportsResponse

class TestListReportsResponse(unittest.TestCase):
    """ListReportsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListReportsResponse:
        """Test ListReportsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListReportsResponse`
        """
        model = ListReportsResponse()
        if include_optional:
            return ListReportsResponse(
                next_page_token = '',
                reports = [
                    openapi_client.models.report.Report(
                        key = openapi_client.models.report_key.ReportKey(
                            query_id = '', 
                            report_id = '', ), 
                        metadata = openapi_client.models.report_metadata.ReportMetadata(
                            google_cloud_storage_path = '', 
                            report_data_end_date = openapi_client.models.date.Date(
                                day = 56, 
                                month = 56, 
                                year = 56, ), 
                            report_data_start_date = openapi_client.models.date.Date(
                                day = 56, 
                                month = 56, 
                                year = 56, ), 
                            status = openapi_client.models.report_status.ReportStatus(
                                finish_time = '', 
                                format = 'FORMAT_UNSPECIFIED', 
                                state = 'STATE_UNSPECIFIED', ), ), 
                        params = openapi_client.models.parameters.Parameters(
                            filters = [
                                openapi_client.models.filter_pair.FilterPair(
                                    type = '', 
                                    value = '', )
                                ], 
                            group_bys = [
                                ''
                                ], 
                            metrics = [
                                ''
                                ], 
                            options = openapi_client.models.options.Options(
                                include_only_targeted_user_lists = True, 
                                path_query_options = openapi_client.models.path_query_options.PathQueryOptions(
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
                                            path_match_position = 'PATH_MATCH_POSITION_UNSPECIFIED', )
                                        ], ), ), 
                            type = 'REPORT_TYPE_UNSPECIFIED', ), )
                    ]
            )
        else:
            return ListReportsResponse(
        )
        """

    def testListReportsResponse(self):
        """Test ListReportsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
