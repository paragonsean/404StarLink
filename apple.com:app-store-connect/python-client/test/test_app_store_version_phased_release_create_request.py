# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_store_version_phased_release_create_request import AppStoreVersionPhasedReleaseCreateRequest

class TestAppStoreVersionPhasedReleaseCreateRequest(unittest.TestCase):
    """AppStoreVersionPhasedReleaseCreateRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppStoreVersionPhasedReleaseCreateRequest:
        """Test AppStoreVersionPhasedReleaseCreateRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppStoreVersionPhasedReleaseCreateRequest`
        """
        model = AppStoreVersionPhasedReleaseCreateRequest()
        if include_optional:
            return AppStoreVersionPhasedReleaseCreateRequest(
                data = openapi_client.models.app_store_version_phased_release_create_request_data.AppStoreVersionPhasedReleaseCreateRequest_data(
                    attributes = openapi_client.models.app_store_version_phased_release_create_request_data_attributes.AppStoreVersionPhasedReleaseCreateRequest_data_attributes(
                        phased_release_state = 'INACTIVE', ), 
                    relationships = openapi_client.models.app_store_review_detail_create_request_data_relationships.AppStoreReviewDetailCreateRequest_data_relationships(
                        app_store_version = openapi_client.models.app_store_review_detail_create_request_data_relationships_app_store_version.AppStoreReviewDetailCreateRequest_data_relationships_appStoreVersion(
                            data = openapi_client.models.app_relationships_app_store_versions_data_inner.App_relationships_appStoreVersions_data_inner(
                                id = '', 
                                type = 'appStoreVersions', ), ), ), 
                    type = 'appStoreVersionPhasedReleases', )
            )
        else:
            return AppStoreVersionPhasedReleaseCreateRequest(
                data = openapi_client.models.app_store_version_phased_release_create_request_data.AppStoreVersionPhasedReleaseCreateRequest_data(
                    attributes = openapi_client.models.app_store_version_phased_release_create_request_data_attributes.AppStoreVersionPhasedReleaseCreateRequest_data_attributes(
                        phased_release_state = 'INACTIVE', ), 
                    relationships = openapi_client.models.app_store_review_detail_create_request_data_relationships.AppStoreReviewDetailCreateRequest_data_relationships(
                        app_store_version = openapi_client.models.app_store_review_detail_create_request_data_relationships_app_store_version.AppStoreReviewDetailCreateRequest_data_relationships_appStoreVersion(
                            data = openapi_client.models.app_relationships_app_store_versions_data_inner.App_relationships_appStoreVersions_data_inner(
                                id = '', 
                                type = 'appStoreVersions', ), ), ), 
                    type = 'appStoreVersionPhasedReleases', ),
        )
        """

    def testAppStoreVersionPhasedReleaseCreateRequest(self):
        """Test AppStoreVersionPhasedReleaseCreateRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
