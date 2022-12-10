# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.in_app_purchases_response import InAppPurchasesResponse

class TestInAppPurchasesResponse(unittest.TestCase):
    """InAppPurchasesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> InAppPurchasesResponse:
        """Test InAppPurchasesResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `InAppPurchasesResponse`
        """
        model = InAppPurchasesResponse()
        if include_optional:
            return InAppPurchasesResponse(
                data = [
                    openapi_client.models.in_app_purchase.InAppPurchase(
                        attributes = openapi_client.models.in_app_purchase_attributes.InAppPurchase_attributes(
                            in_app_purchase_type = 'AUTOMATICALLY_RENEWABLE_SUBSCRIPTION', 
                            product_id = '', 
                            reference_name = '', 
                            state = 'CREATED', ), 
                        id = '', 
                        links = openapi_client.models.resource_links.ResourceLinks(
                            self = '', ), 
                        relationships = openapi_client.models.in_app_purchase_relationships.InAppPurchase_relationships(
                            apps = openapi_client.models.beta_tester_relationships_apps.BetaTester_relationships_apps(
                                data = [
                                    openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                                        id = '', 
                                        type = 'apps', )
                                    ], 
                                meta = openapi_client.models.paging_information.PagingInformation(
                                    paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                        limit = 56, 
                                        total = 56, ), ), ), ), 
                        type = 'inAppPurchases', )
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
            return InAppPurchasesResponse(
                data = [
                    openapi_client.models.in_app_purchase.InAppPurchase(
                        attributes = openapi_client.models.in_app_purchase_attributes.InAppPurchase_attributes(
                            in_app_purchase_type = 'AUTOMATICALLY_RENEWABLE_SUBSCRIPTION', 
                            product_id = '', 
                            reference_name = '', 
                            state = 'CREATED', ), 
                        id = '', 
                        links = openapi_client.models.resource_links.ResourceLinks(
                            self = '', ), 
                        relationships = openapi_client.models.in_app_purchase_relationships.InAppPurchase_relationships(
                            apps = openapi_client.models.beta_tester_relationships_apps.BetaTester_relationships_apps(
                                data = [
                                    openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                                        id = '', 
                                        type = 'apps', )
                                    ], 
                                meta = openapi_client.models.paging_information.PagingInformation(
                                    paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                        limit = 56, 
                                        total = 56, ), ), ), ), 
                        type = 'inAppPurchases', )
                    ],
                links = openapi_client.models.paged_document_links.PagedDocumentLinks(
                    first = '', 
                    next = '', 
                    self = '', ),
        )
        """

    def testInAppPurchasesResponse(self):
        """Test InAppPurchasesResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
