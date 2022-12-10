# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_store_review_detail_response import AppStoreReviewDetailResponse

class TestAppStoreReviewDetailResponse(unittest.TestCase):
    """AppStoreReviewDetailResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppStoreReviewDetailResponse:
        """Test AppStoreReviewDetailResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppStoreReviewDetailResponse`
        """
        model = AppStoreReviewDetailResponse()
        if include_optional:
            return AppStoreReviewDetailResponse(
                data = openapi_client.models.app_store_review_detail.AppStoreReviewDetail(
                    attributes = openapi_client.models.app_store_review_detail_attributes.AppStoreReviewDetail_attributes(
                        contact_email = '', 
                        contact_first_name = '', 
                        contact_last_name = '', 
                        contact_phone = '', 
                        demo_account_name = '', 
                        demo_account_password = '', 
                        demo_account_required = True, 
                        notes = '', ), 
                    id = '', 
                    links = openapi_client.models.resource_links.ResourceLinks(
                        self = '', ), 
                    relationships = openapi_client.models.app_store_review_detail_relationships.AppStoreReviewDetail_relationships(
                        app_store_review_attachments = openapi_client.models.app_store_review_detail_relationships_app_store_review_attachments.AppStoreReviewDetail_relationships_appStoreReviewAttachments(
                            data = [
                                openapi_client.models.app_store_review_detail_relationships_app_store_review_attachments_data_inner.AppStoreReviewDetail_relationships_appStoreReviewAttachments_data_inner(
                                    id = '', 
                                    type = 'appStoreReviewAttachments', )
                                ], 
                            meta = openapi_client.models.paging_information.PagingInformation(
                                paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                    limit = 56, 
                                    total = 56, ), ), ), 
                        app_store_version = openapi_client.models.app_store_review_detail_relationships_app_store_version.AppStoreReviewDetail_relationships_appStoreVersion(), ), 
                    type = 'appStoreReviewDetails', ),
                included = [
                    openapi_client.models.app_store_review_attachment.AppStoreReviewAttachment(
                        attributes = openapi_client.models.app_store_review_attachment_attributes.AppStoreReviewAttachment_attributes(
                            asset_delivery_state = openapi_client.models.app_media_asset_state.AppMediaAssetState(
                                errors = [
                                    openapi_client.models.app_media_state_error.AppMediaStateError(
                                        code = '', 
                                        description = '', )
                                    ], 
                                state = 'AWAITING_UPLOAD', 
                                warnings = [
                                    openapi_client.models.app_media_state_error.AppMediaStateError(
                                        code = '', 
                                        description = '', )
                                    ], ), 
                            file_name = '', 
                            file_size = 56, 
                            source_file_checksum = '', 
                            upload_operations = [
                                openapi_client.models.upload_operation.UploadOperation(
                                    length = 56, 
                                    method = '', 
                                    offset = 56, 
                                    request_headers = [
                                        openapi_client.models.upload_operation_header.UploadOperationHeader(
                                            name = '', 
                                            value = '', )
                                        ], 
                                    url = '', )
                                ], ), 
                        id = '', 
                        links = openapi_client.models.resource_links.ResourceLinks(
                            self = '', ), 
                        relationships = openapi_client.models.app_store_review_attachment_relationships.AppStoreReviewAttachment_relationships(
                            app_store_review_detail = openapi_client.models.app_store_review_attachment_relationships_app_store_review_detail.AppStoreReviewAttachment_relationships_appStoreReviewDetail(
                                data = openapi_client.models.app_store_review_attachment_relationships_app_store_review_detail_data.AppStoreReviewAttachment_relationships_appStoreReviewDetail_data(
                                    id = '', 
                                    type = 'appStoreReviewDetails', ), ), ), 
                        type = 'appStoreReviewAttachments', )
                    ],
                links = openapi_client.models.document_links.DocumentLinks(
                    self = '', )
            )
        else:
            return AppStoreReviewDetailResponse(
                data = openapi_client.models.app_store_review_detail.AppStoreReviewDetail(
                    attributes = openapi_client.models.app_store_review_detail_attributes.AppStoreReviewDetail_attributes(
                        contact_email = '', 
                        contact_first_name = '', 
                        contact_last_name = '', 
                        contact_phone = '', 
                        demo_account_name = '', 
                        demo_account_password = '', 
                        demo_account_required = True, 
                        notes = '', ), 
                    id = '', 
                    links = openapi_client.models.resource_links.ResourceLinks(
                        self = '', ), 
                    relationships = openapi_client.models.app_store_review_detail_relationships.AppStoreReviewDetail_relationships(
                        app_store_review_attachments = openapi_client.models.app_store_review_detail_relationships_app_store_review_attachments.AppStoreReviewDetail_relationships_appStoreReviewAttachments(
                            data = [
                                openapi_client.models.app_store_review_detail_relationships_app_store_review_attachments_data_inner.AppStoreReviewDetail_relationships_appStoreReviewAttachments_data_inner(
                                    id = '', 
                                    type = 'appStoreReviewAttachments', )
                                ], 
                            meta = openapi_client.models.paging_information.PagingInformation(
                                paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                    limit = 56, 
                                    total = 56, ), ), ), 
                        app_store_version = openapi_client.models.app_store_review_detail_relationships_app_store_version.AppStoreReviewDetail_relationships_appStoreVersion(), ), 
                    type = 'appStoreReviewDetails', ),
                links = openapi_client.models.document_links.DocumentLinks(
                    self = '', ),
        )
        """

    def testAppStoreReviewDetailResponse(self):
        """Test AppStoreReviewDetailResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
