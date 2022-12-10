# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_store_version_phased_release_update_request_data import AppStoreVersionPhasedReleaseUpdateRequestData

class TestAppStoreVersionPhasedReleaseUpdateRequestData(unittest.TestCase):
    """AppStoreVersionPhasedReleaseUpdateRequestData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppStoreVersionPhasedReleaseUpdateRequestData:
        """Test AppStoreVersionPhasedReleaseUpdateRequestData
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppStoreVersionPhasedReleaseUpdateRequestData`
        """
        model = AppStoreVersionPhasedReleaseUpdateRequestData()
        if include_optional:
            return AppStoreVersionPhasedReleaseUpdateRequestData(
                attributes = openapi_client.models.app_store_version_phased_release_create_request_data_attributes.AppStoreVersionPhasedReleaseCreateRequest_data_attributes(
                    phased_release_state = 'INACTIVE', ),
                id = '',
                type = 'appStoreVersionPhasedReleases'
            )
        else:
            return AppStoreVersionPhasedReleaseUpdateRequestData(
                id = '',
                type = 'appStoreVersionPhasedReleases',
        )
        """

    def testAppStoreVersionPhasedReleaseUpdateRequestData(self):
        """Test AppStoreVersionPhasedReleaseUpdateRequestData"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
