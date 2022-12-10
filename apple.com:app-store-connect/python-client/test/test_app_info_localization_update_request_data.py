# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_info_localization_update_request_data import AppInfoLocalizationUpdateRequestData

class TestAppInfoLocalizationUpdateRequestData(unittest.TestCase):
    """AppInfoLocalizationUpdateRequestData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppInfoLocalizationUpdateRequestData:
        """Test AppInfoLocalizationUpdateRequestData
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppInfoLocalizationUpdateRequestData`
        """
        model = AppInfoLocalizationUpdateRequestData()
        if include_optional:
            return AppInfoLocalizationUpdateRequestData(
                attributes = openapi_client.models.app_info_localization_update_request_data_attributes.AppInfoLocalizationUpdateRequest_data_attributes(
                    name = '', 
                    privacy_policy_text = '', 
                    privacy_policy_url = '', 
                    subtitle = '', ),
                id = '',
                type = 'appInfoLocalizations'
            )
        else:
            return AppInfoLocalizationUpdateRequestData(
                id = '',
                type = 'appInfoLocalizations',
        )
        """

    def testAppInfoLocalizationUpdateRequestData(self):
        """Test AppInfoLocalizationUpdateRequestData"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
