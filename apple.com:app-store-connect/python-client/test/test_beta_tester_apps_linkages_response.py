# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.beta_tester_apps_linkages_response import BetaTesterAppsLinkagesResponse

class TestBetaTesterAppsLinkagesResponse(unittest.TestCase):
    """BetaTesterAppsLinkagesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BetaTesterAppsLinkagesResponse:
        """Test BetaTesterAppsLinkagesResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BetaTesterAppsLinkagesResponse`
        """
        model = BetaTesterAppsLinkagesResponse()
        if include_optional:
            return BetaTesterAppsLinkagesResponse(
                data = [
                    openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                        id = '', 
                        type = 'apps', )
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
            return BetaTesterAppsLinkagesResponse(
                data = [
                    openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                        id = '', 
                        type = 'apps', )
                    ],
                links = openapi_client.models.paged_document_links.PagedDocumentLinks(
                    first = '', 
                    next = '', 
                    self = '', ),
        )
        """

    def testBetaTesterAppsLinkagesResponse(self):
        """Test BetaTesterAppsLinkagesResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
