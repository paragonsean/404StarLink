# coding: utf-8

"""
    PageSpeed Insights

    Analyzes the performance of a web page and provides tailored suggestions to make that page faster.

    The version of the OpenAPI document: v4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.pagespeed_api_pagespeed_response_v4_formatted_results_rule_results_value import PagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue

class TestPagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue(unittest.TestCase):
    """PagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue:
        """Test PagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue`
        """
        model = PagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue()
        if include_optional:
            return PagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue(
                beta = True,
                groups = [
                    ''
                    ],
                localized_rule_name = '',
                rule_impact = 1.337,
                summary = openapi_client.models.pagespeed_api_format_string_v4.PagespeedApiFormatStringV4(
                    args = [
                        openapi_client.models.pagespeed_api_format_string_v4_args_inner.PagespeedApiFormatStringV4_args_inner(
                            key = '', 
                            rects = [
                                openapi_client.models.pagespeed_api_format_string_v4_args_inner_rects_inner.PagespeedApiFormatStringV4_args_inner_rects_inner(
                                    height = 56, 
                                    left = 56, 
                                    top = 56, 
                                    width = 56, )
                                ], 
                            secondary_rects = [
                                openapi_client.models.pagespeed_api_format_string_v4_args_inner_rects_inner.PagespeedApiFormatStringV4_args_inner_rects_inner(
                                    height = 56, 
                                    left = 56, 
                                    top = 56, 
                                    width = 56, )
                                ], 
                            type = '', 
                            value = '', )
                        ], 
                    format = '', ),
                url_blocks = [
                    openapi_client.models.pagespeed_api_pagespeed_response_v4_formatted_results_rule_results_value_url_blocks_inner.PagespeedApiPagespeedResponseV4_formattedResults_ruleResults_value_urlBlocks_inner(
                        header = openapi_client.models.pagespeed_api_format_string_v4.PagespeedApiFormatStringV4(
                            args = [
                                openapi_client.models.pagespeed_api_format_string_v4_args_inner.PagespeedApiFormatStringV4_args_inner(
                                    key = '', 
                                    rects = [
                                        openapi_client.models.pagespeed_api_format_string_v4_args_inner_rects_inner.PagespeedApiFormatStringV4_args_inner_rects_inner(
                                            height = 56, 
                                            left = 56, 
                                            top = 56, 
                                            width = 56, )
                                        ], 
                                    secondary_rects = [
                                        openapi_client.models.pagespeed_api_format_string_v4_args_inner_rects_inner.PagespeedApiFormatStringV4_args_inner_rects_inner(
                                            height = 56, 
                                            left = 56, 
                                            top = 56, 
                                            width = 56, )
                                        ], 
                                    type = '', 
                                    value = '', )
                                ], 
                            format = '', ), 
                        urls = [
                            openapi_client.models.pagespeed_api_pagespeed_response_v4_formatted_results_rule_results_value_url_blocks_inner_urls_inner.PagespeedApiPagespeedResponseV4_formattedResults_ruleResults_value_urlBlocks_inner_urls_inner(
                                details = [
                                    openapi_client.models.pagespeed_api_format_string_v4.PagespeedApiFormatStringV4(
                                        format = '', )
                                    ], 
                                result = , )
                            ], )
                    ]
            )
        else:
            return PagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue(
        )
        """

    def testPagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue(self):
        """Test PagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
