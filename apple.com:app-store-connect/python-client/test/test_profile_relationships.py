# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.profile_relationships import ProfileRelationships

class TestProfileRelationships(unittest.TestCase):
    """ProfileRelationships unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ProfileRelationships:
        """Test ProfileRelationships
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ProfileRelationships`
        """
        model = ProfileRelationships()
        if include_optional:
            return ProfileRelationships(
                bundle_id = openapi_client.models.profile_relationships_bundle_id.Profile_relationships_bundleId(
                    data = openapi_client.models.bundle_id_capability_create_request_data_relationships_bundle_id_data.BundleIdCapabilityCreateRequest_data_relationships_bundleId_data(
                        id = '', 
                        type = 'bundleIds', ), 
                    links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                        related = '', 
                        self = '', ), ),
                certificates = openapi_client.models.profile_relationships_certificates.Profile_relationships_certificates(
                    data = [
                        openapi_client.models.profile_relationships_certificates_data_inner.Profile_relationships_certificates_data_inner(
                            id = '', 
                            type = 'certificates', )
                        ], 
                    links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                        related = '', 
                        self = '', ), 
                    meta = openapi_client.models.paging_information.PagingInformation(
                        paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                            limit = 56, 
                            total = 56, ), ), ),
                devices = openapi_client.models.profile_relationships_devices.Profile_relationships_devices(
                    data = [
                        openapi_client.models.profile_relationships_devices_data_inner.Profile_relationships_devices_data_inner(
                            id = '', 
                            type = 'devices', )
                        ], 
                    links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                        related = '', 
                        self = '', ), 
                    meta = openapi_client.models.paging_information.PagingInformation(
                        paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                            limit = 56, 
                            total = 56, ), ), )
            )
        else:
            return ProfileRelationships(
        )
        """

    def testProfileRelationships(self):
        """Test ProfileRelationships"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
