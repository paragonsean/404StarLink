# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_screenshot_relationships_app_screenshot_set_data import AppScreenshotRelationshipsAppScreenshotSetData

class TestAppScreenshotRelationshipsAppScreenshotSetData(unittest.TestCase):
    """AppScreenshotRelationshipsAppScreenshotSetData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppScreenshotRelationshipsAppScreenshotSetData:
        """Test AppScreenshotRelationshipsAppScreenshotSetData
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppScreenshotRelationshipsAppScreenshotSetData`
        """
        model = AppScreenshotRelationshipsAppScreenshotSetData()
        if include_optional:
            return AppScreenshotRelationshipsAppScreenshotSetData(
                id = '',
                type = 'appScreenshotSets'
            )
        else:
            return AppScreenshotRelationshipsAppScreenshotSetData(
                id = '',
                type = 'appScreenshotSets',
        )
        """

    def testAppScreenshotRelationshipsAppScreenshotSetData(self):
        """Test AppScreenshotRelationshipsAppScreenshotSetData"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
