# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.bundle_ids_response import BundleIdsResponse

class TestBundleIdsResponse(unittest.TestCase):
    """BundleIdsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BundleIdsResponse:
        """Test BundleIdsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BundleIdsResponse`
        """
        model = BundleIdsResponse()
        if include_optional:
            return BundleIdsResponse(
                data = [
                    openapi_client.models.bundle_id.BundleId(
                        attributes = openapi_client.models.bundle_id_attributes.BundleId_attributes(
                            identifier = '', 
                            name = '', 
                            platform = 'IOS', 
                            seed_id = '', ), 
                        id = '', 
                        links = openapi_client.models.resource_links.ResourceLinks(
                            self = '', ), 
                        relationships = openapi_client.models.bundle_id_relationships.BundleId_relationships(
                            app = openapi_client.models.app_encryption_declaration_relationships_app.AppEncryptionDeclaration_relationships_app(
                                data = openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                                    id = '', 
                                    type = 'apps', ), ), 
                            bundle_id_capabilities = openapi_client.models.bundle_id_relationships_bundle_id_capabilities.BundleId_relationships_bundleIdCapabilities(
                                meta = openapi_client.models.paging_information.PagingInformation(
                                    paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                        limit = 56, 
                                        total = 56, ), ), ), 
                            profiles = openapi_client.models.bundle_id_relationships_profiles.BundleId_relationships_profiles(), ), 
                        type = 'bundleIds', )
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
            return BundleIdsResponse(
                data = [
                    openapi_client.models.bundle_id.BundleId(
                        attributes = openapi_client.models.bundle_id_attributes.BundleId_attributes(
                            identifier = '', 
                            name = '', 
                            platform = 'IOS', 
                            seed_id = '', ), 
                        id = '', 
                        links = openapi_client.models.resource_links.ResourceLinks(
                            self = '', ), 
                        relationships = openapi_client.models.bundle_id_relationships.BundleId_relationships(
                            app = openapi_client.models.app_encryption_declaration_relationships_app.AppEncryptionDeclaration_relationships_app(
                                data = openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                                    id = '', 
                                    type = 'apps', ), ), 
                            bundle_id_capabilities = openapi_client.models.bundle_id_relationships_bundle_id_capabilities.BundleId_relationships_bundleIdCapabilities(
                                meta = openapi_client.models.paging_information.PagingInformation(
                                    paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                        limit = 56, 
                                        total = 56, ), ), ), 
                            profiles = openapi_client.models.bundle_id_relationships_profiles.BundleId_relationships_profiles(), ), 
                        type = 'bundleIds', )
                    ],
                links = openapi_client.models.paged_document_links.PagedDocumentLinks(
                    first = '', 
                    next = '', 
                    self = '', ),
        )
        """

    def testBundleIdsResponse(self):
        """Test BundleIdsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
