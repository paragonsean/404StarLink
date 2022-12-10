# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.beta_app_review_detail_response import BetaAppReviewDetailResponse

class TestBetaAppReviewDetailResponse(unittest.TestCase):
    """BetaAppReviewDetailResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BetaAppReviewDetailResponse:
        """Test BetaAppReviewDetailResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BetaAppReviewDetailResponse`
        """
        model = BetaAppReviewDetailResponse()
        if include_optional:
            return BetaAppReviewDetailResponse(
                data = openapi_client.models.beta_app_review_detail.BetaAppReviewDetail(
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
                    relationships = openapi_client.models.app_encryption_declaration_relationships.AppEncryptionDeclaration_relationships(
                        app = openapi_client.models.app_encryption_declaration_relationships_app.AppEncryptionDeclaration_relationships_app(
                            data = openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                                id = '', 
                                type = 'apps', ), ), ), 
                    type = 'betaAppReviewDetails', ),
                included = [
                    openapi_client.models.app.App(
                        attributes = openapi_client.models.app_attributes.App_attributes(
                            available_in_new_territories = True, 
                            bundle_id = '', 
                            content_rights_declaration = 'DOES_NOT_USE_THIRD_PARTY_CONTENT', 
                            is_or_ever_was_made_for_kids = True, 
                            name = '', 
                            primary_locale = '', 
                            sku = '', ), 
                        id = '', 
                        links = openapi_client.models.resource_links.ResourceLinks(
                            self = '', ), 
                        relationships = openapi_client.models.app_relationships.App_relationships(
                            app_infos = openapi_client.models.app_relationships_app_infos.App_relationships_appInfos(
                                data = [
                                    openapi_client.models.app_relationships_app_infos_data_inner.App_relationships_appInfos_data_inner(
                                        id = '', 
                                        type = 'appInfos', )
                                    ], 
                                meta = openapi_client.models.paging_information.PagingInformation(
                                    paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                        limit = 56, 
                                        total = 56, ), ), ), 
                            app_store_versions = openapi_client.models.app_relationships_app_store_versions.App_relationships_appStoreVersions(), 
                            available_territories = openapi_client.models.app_relationships_available_territories.App_relationships_availableTerritories(), 
                            beta_app_localizations = openapi_client.models.app_relationships_beta_app_localizations.App_relationships_betaAppLocalizations(), 
                            beta_app_review_detail = openapi_client.models.app_relationships_beta_app_review_detail.App_relationships_betaAppReviewDetail(), 
                            beta_groups = openapi_client.models.app_relationships_beta_groups.App_relationships_betaGroups(), 
                            beta_license_agreement = openapi_client.models.app_relationships_beta_license_agreement.App_relationships_betaLicenseAgreement(), 
                            builds = openapi_client.models.app_relationships_builds.App_relationships_builds(), 
                            end_user_license_agreement = openapi_client.models.app_relationships_end_user_license_agreement.App_relationships_endUserLicenseAgreement(), 
                            game_center_enabled_versions = openapi_client.models.app_relationships_game_center_enabled_versions.App_relationships_gameCenterEnabledVersions(), 
                            in_app_purchases = openapi_client.models.app_relationships_in_app_purchases.App_relationships_inAppPurchases(), 
                            pre_order = openapi_client.models.app_relationships_pre_order.App_relationships_preOrder(), 
                            pre_release_versions = openapi_client.models.app_relationships_pre_release_versions.App_relationships_preReleaseVersions(), 
                            prices = openapi_client.models.app_relationships_prices.App_relationships_prices(), ), 
                        type = 'apps', )
                    ],
                links = openapi_client.models.document_links.DocumentLinks(
                    self = '', )
            )
        else:
            return BetaAppReviewDetailResponse(
                data = openapi_client.models.beta_app_review_detail.BetaAppReviewDetail(
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
                    relationships = openapi_client.models.app_encryption_declaration_relationships.AppEncryptionDeclaration_relationships(
                        app = openapi_client.models.app_encryption_declaration_relationships_app.AppEncryptionDeclaration_relationships_app(
                            data = openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                                id = '', 
                                type = 'apps', ), ), ), 
                    type = 'betaAppReviewDetails', ),
                links = openapi_client.models.document_links.DocumentLinks(
                    self = '', ),
        )
        """

    def testBetaAppReviewDetailResponse(self):
        """Test BetaAppReviewDetailResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
