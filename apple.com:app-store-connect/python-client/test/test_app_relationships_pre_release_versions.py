# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_relationships_pre_release_versions import AppRelationshipsPreReleaseVersions

class TestAppRelationshipsPreReleaseVersions(unittest.TestCase):
    """AppRelationshipsPreReleaseVersions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppRelationshipsPreReleaseVersions:
        """Test AppRelationshipsPreReleaseVersions
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppRelationshipsPreReleaseVersions`
        """
        model = AppRelationshipsPreReleaseVersions()
        if include_optional:
            return AppRelationshipsPreReleaseVersions(
                data = [
                    openapi_client.models.app_relationships_pre_release_versions_data_inner.App_relationships_preReleaseVersions_data_inner(
                        id = '', 
                        type = 'preReleaseVersions', )
                    ],
                links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                    related = '', 
                    self = '', ),
                meta = openapi_client.models.paging_information.PagingInformation(
                    paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                        limit = 56, 
                        total = 56, ), )
            )
        else:
            return AppRelationshipsPreReleaseVersions(
        )
        """

    def testAppRelationshipsPreReleaseVersions(self):
        """Test AppRelationshipsPreReleaseVersions"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
