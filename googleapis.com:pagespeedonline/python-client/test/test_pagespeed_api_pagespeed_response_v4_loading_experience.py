# coding: utf-8

"""
    PageSpeed Insights

    Analyzes the performance of a web page and provides tailored suggestions to make that page faster.

    The version of the OpenAPI document: v4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.pagespeed_api_pagespeed_response_v4_loading_experience import PagespeedApiPagespeedResponseV4LoadingExperience

class TestPagespeedApiPagespeedResponseV4LoadingExperience(unittest.TestCase):
    """PagespeedApiPagespeedResponseV4LoadingExperience unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PagespeedApiPagespeedResponseV4LoadingExperience:
        """Test PagespeedApiPagespeedResponseV4LoadingExperience
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PagespeedApiPagespeedResponseV4LoadingExperience`
        """
        model = PagespeedApiPagespeedResponseV4LoadingExperience()
        if include_optional:
            return PagespeedApiPagespeedResponseV4LoadingExperience(
                id = '',
                initial_url = '',
                metrics = {
                    'key' : openapi_client.models.pagespeed_api_pagespeed_response_v4_loading_experience_metrics_value.PagespeedApiPagespeedResponseV4_loadingExperience_metrics_value(
                        category = '', 
                        distributions = [
                            openapi_client.models.pagespeed_api_pagespeed_response_v4_loading_experience_metrics_value_distributions_inner.PagespeedApiPagespeedResponseV4_loadingExperience_metrics_value_distributions_inner(
                                max = 56, 
                                min = 56, 
                                proportion = 1.337, )
                            ], 
                        median = 56, )
                    },
                overall_category = ''
            )
        else:
            return PagespeedApiPagespeedResponseV4LoadingExperience(
        )
        """

    def testPagespeedApiPagespeedResponseV4LoadingExperience(self):
        """Test PagespeedApiPagespeedResponseV4LoadingExperience"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
