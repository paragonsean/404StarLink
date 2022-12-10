# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.profile import Profile

class TestProfile(unittest.TestCase):
    """Profile unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Profile:
        """Test Profile
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Profile`
        """
        model = Profile()
        if include_optional:
            return Profile(
                attributes = openapi_client.models.profile_attributes.Profile_attributes(
                    created_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    expiration_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    name = '', 
                    platform = 'IOS', 
                    profile_content = '', 
                    profile_state = 'ACTIVE', 
                    profile_type = 'IOS_APP_DEVELOPMENT', 
                    uuid = '', ),
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                relationships = openapi_client.models.profile_relationships.Profile_relationships(
                    bundle_id = openapi_client.models.profile_relationships_bundle_id.Profile_relationships_bundleId(
                        data = openapi_client.models.bundle_id_capability_create_request_data_relationships_bundle_id_data.BundleIdCapabilityCreateRequest_data_relationships_bundleId_data(
                            id = '', 
                            type = 'bundleIds', ), 
                        links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                            related = '', 
                            self = '', ), ), 
                    certificates = openapi_client.models.profile_relationships_certificates.Profile_relationships_certificates(
                        meta = openapi_client.models.paging_information.PagingInformation(
                            paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                limit = 56, 
                                total = 56, ), ), ), 
                    devices = openapi_client.models.profile_relationships_devices.Profile_relationships_devices(), ),
                type = 'profiles'
            )
        else:
            return Profile(
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                type = 'profiles',
        )
        """

    def testProfile(self):
        """Test Profile"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
