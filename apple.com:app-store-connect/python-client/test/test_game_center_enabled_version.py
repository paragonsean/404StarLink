# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.game_center_enabled_version import GameCenterEnabledVersion

class TestGameCenterEnabledVersion(unittest.TestCase):
    """GameCenterEnabledVersion unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GameCenterEnabledVersion:
        """Test GameCenterEnabledVersion
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GameCenterEnabledVersion`
        """
        model = GameCenterEnabledVersion()
        if include_optional:
            return GameCenterEnabledVersion(
                attributes = openapi_client.models.game_center_enabled_version_attributes.GameCenterEnabledVersion_attributes(
                    icon_asset = openapi_client.models.image_asset.ImageAsset(
                        height = 56, 
                        template_url = '', 
                        width = 56, ), 
                    platform = 'IOS', 
                    version_string = '', ),
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                relationships = openapi_client.models.game_center_enabled_version_relationships.GameCenterEnabledVersion_relationships(
                    app = openapi_client.models.app_encryption_declaration_relationships_app.AppEncryptionDeclaration_relationships_app(
                        data = openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                            id = '', 
                            type = 'apps', ), 
                        links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                            related = '', 
                            self = '', ), ), 
                    compatible_versions = openapi_client.models.app_relationships_game_center_enabled_versions.App_relationships_gameCenterEnabledVersions(
                        meta = openapi_client.models.paging_information.PagingInformation(
                            paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                limit = 56, 
                                total = 56, ), ), ), ),
                type = 'gameCenterEnabledVersions'
            )
        else:
            return GameCenterEnabledVersion(
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                type = 'gameCenterEnabledVersions',
        )
        """

    def testGameCenterEnabledVersion(self):
        """Test GameCenterEnabledVersion"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
