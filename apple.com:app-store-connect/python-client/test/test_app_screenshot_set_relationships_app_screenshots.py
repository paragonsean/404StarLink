# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_screenshot_set_relationships_app_screenshots import AppScreenshotSetRelationshipsAppScreenshots

class TestAppScreenshotSetRelationshipsAppScreenshots(unittest.TestCase):
    """AppScreenshotSetRelationshipsAppScreenshots unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppScreenshotSetRelationshipsAppScreenshots:
        """Test AppScreenshotSetRelationshipsAppScreenshots
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppScreenshotSetRelationshipsAppScreenshots`
        """
        model = AppScreenshotSetRelationshipsAppScreenshots()
        if include_optional:
            return AppScreenshotSetRelationshipsAppScreenshots(
                data = [
                    openapi_client.models.app_screenshot_set_relationships_app_screenshots_data_inner.AppScreenshotSet_relationships_appScreenshots_data_inner(
                        id = '', 
                        type = 'appScreenshots', )
                    ],
                links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                    related = '', 
                    self = '', ),
                meta = openapi_client.models.paging_information.PagingInformation(
                    paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                        limit = 56, 
                        total = 56, ), )
            )
        else:
            return AppScreenshotSetRelationshipsAppScreenshots(
        )
        """

    def testAppScreenshotSetRelationshipsAppScreenshots(self):
        """Test AppScreenshotSetRelationshipsAppScreenshots"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
