# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_store_version_localizations_response import AppStoreVersionLocalizationsResponse

class TestAppStoreVersionLocalizationsResponse(unittest.TestCase):
    """AppStoreVersionLocalizationsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppStoreVersionLocalizationsResponse:
        """Test AppStoreVersionLocalizationsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppStoreVersionLocalizationsResponse`
        """
        model = AppStoreVersionLocalizationsResponse()
        if include_optional:
            return AppStoreVersionLocalizationsResponse(
                data = [
                    openapi_client.models.app_store_version_localization.AppStoreVersionLocalization(
                        attributes = openapi_client.models.app_store_version_localization_attributes.AppStoreVersionLocalization_attributes(
                            description = '', 
                            keywords = '', 
                            locale = '', 
                            marketing_url = '', 
                            promotional_text = '', 
                            support_url = '', 
                            whats_new = '', ), 
                        id = '', 
                        links = openapi_client.models.resource_links.ResourceLinks(
                            self = '', ), 
                        relationships = openapi_client.models.app_store_version_localization_relationships.AppStoreVersionLocalization_relationships(
                            app_preview_sets = openapi_client.models.app_store_version_localization_relationships_app_preview_sets.AppStoreVersionLocalization_relationships_appPreviewSets(
                                data = [
                                    openapi_client.models.app_preview_relationships_app_preview_set_data.AppPreview_relationships_appPreviewSet_data(
                                        id = '', 
                                        type = 'appPreviewSets', )
                                    ], 
                                meta = openapi_client.models.paging_information.PagingInformation(
                                    paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                        limit = 56, 
                                        total = 56, ), ), ), 
                            app_screenshot_sets = openapi_client.models.app_store_version_localization_relationships_app_screenshot_sets.AppStoreVersionLocalization_relationships_appScreenshotSets(), 
                            app_store_version = openapi_client.models.app_store_review_detail_relationships_app_store_version.AppStoreReviewDetail_relationships_appStoreVersion(), ), 
                        type = 'appStoreVersionLocalizations', )
                    ],
                included = [
                    null
                    ],
                links = openapi_client.models.paged_document_links.PagedDocumentLinks(
                    first = '', 
                    next = '', 
                    self = '', ),
                meta = openapi_client.models.paging_information.PagingInformation(
                    paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                        limit = 56, 
                        total = 56, ), )
            )
        else:
            return AppStoreVersionLocalizationsResponse(
                data = [
                    openapi_client.models.app_store_version_localization.AppStoreVersionLocalization(
                        attributes = openapi_client.models.app_store_version_localization_attributes.AppStoreVersionLocalization_attributes(
                            description = '', 
                            keywords = '', 
                            locale = '', 
                            marketing_url = '', 
                            promotional_text = '', 
                            support_url = '', 
                            whats_new = '', ), 
                        id = '', 
                        links = openapi_client.models.resource_links.ResourceLinks(
                            self = '', ), 
                        relationships = openapi_client.models.app_store_version_localization_relationships.AppStoreVersionLocalization_relationships(
                            app_preview_sets = openapi_client.models.app_store_version_localization_relationships_app_preview_sets.AppStoreVersionLocalization_relationships_appPreviewSets(
                                data = [
                                    openapi_client.models.app_preview_relationships_app_preview_set_data.AppPreview_relationships_appPreviewSet_data(
                                        id = '', 
                                        type = 'appPreviewSets', )
                                    ], 
                                meta = openapi_client.models.paging_information.PagingInformation(
                                    paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                        limit = 56, 
                                        total = 56, ), ), ), 
                            app_screenshot_sets = openapi_client.models.app_store_version_localization_relationships_app_screenshot_sets.AppStoreVersionLocalization_relationships_appScreenshotSets(), 
                            app_store_version = openapi_client.models.app_store_review_detail_relationships_app_store_version.AppStoreReviewDetail_relationships_appStoreVersion(), ), 
                        type = 'appStoreVersionLocalizations', )
                    ],
                links = openapi_client.models.paged_document_links.PagedDocumentLinks(
                    first = '', 
                    next = '', 
                    self = '', ),
        )
        """

    def testAppStoreVersionLocalizationsResponse(self):
        """Test AppStoreVersionLocalizationsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
