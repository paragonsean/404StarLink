# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.build_icon import BuildIcon

class TestBuildIcon(unittest.TestCase):
    """BuildIcon unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BuildIcon:
        """Test BuildIcon
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BuildIcon`
        """
        model = BuildIcon()
        if include_optional:
            return BuildIcon(
                attributes = openapi_client.models.build_icon_attributes.BuildIcon_attributes(
                    icon_asset = openapi_client.models.image_asset.ImageAsset(
                        height = 56, 
                        template_url = '', 
                        width = 56, ), 
                    icon_type = 'APP_STORE', ),
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                type = 'buildIcons'
            )
        else:
            return BuildIcon(
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                type = 'buildIcons',
        )
        """

    def testBuildIcon(self):
        """Test BuildIcon"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
