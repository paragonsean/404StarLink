# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.build_icons_response import BuildIconsResponse

class TestBuildIconsResponse(unittest.TestCase):
    """BuildIconsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BuildIconsResponse:
        """Test BuildIconsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BuildIconsResponse`
        """
        model = BuildIconsResponse()
        if include_optional:
            return BuildIconsResponse(
                data = [
                    openapi_client.models.build_icon.BuildIcon(
                        attributes = openapi_client.models.build_icon_attributes.BuildIcon_attributes(
                            icon_asset = openapi_client.models.image_asset.ImageAsset(
                                height = 56, 
                                template_url = '', 
                                width = 56, ), 
                            icon_type = 'APP_STORE', ), 
                        id = '', 
                        links = openapi_client.models.resource_links.ResourceLinks(
                            self = '', ), 
                        type = 'buildIcons', )
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
            return BuildIconsResponse(
                data = [
                    openapi_client.models.build_icon.BuildIcon(
                        attributes = openapi_client.models.build_icon_attributes.BuildIcon_attributes(
                            icon_asset = openapi_client.models.image_asset.ImageAsset(
                                height = 56, 
                                template_url = '', 
                                width = 56, ), 
                            icon_type = 'APP_STORE', ), 
                        id = '', 
                        links = openapi_client.models.resource_links.ResourceLinks(
                            self = '', ), 
                        type = 'buildIcons', )
                    ],
                links = openapi_client.models.paged_document_links.PagedDocumentLinks(
                    first = '', 
                    next = '', 
                    self = '', ),
        )
        """

    def testBuildIconsResponse(self):
        """Test BuildIconsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
