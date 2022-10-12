# coding: utf-8

"""
    PageSpeed Insights

    Analyzes the performance of a web page and provides tailored suggestions to make that page faster.

    The version of the OpenAPI document: v4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.pagespeed_api_format_string_v4 import PagespeedApiFormatStringV4

class TestPagespeedApiFormatStringV4(unittest.TestCase):
    """PagespeedApiFormatStringV4 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PagespeedApiFormatStringV4:
        """Test PagespeedApiFormatStringV4
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PagespeedApiFormatStringV4`
        """
        model = PagespeedApiFormatStringV4()
        if include_optional:
            return PagespeedApiFormatStringV4(
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
                format = ''
            )
        else:
            return PagespeedApiFormatStringV4(
        )
        """

    def testPagespeedApiFormatStringV4(self):
        """Test PagespeedApiFormatStringV4"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
