# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.user_invitation_create_request import UserInvitationCreateRequest

class TestUserInvitationCreateRequest(unittest.TestCase):
    """UserInvitationCreateRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UserInvitationCreateRequest:
        """Test UserInvitationCreateRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UserInvitationCreateRequest`
        """
        model = UserInvitationCreateRequest()
        if include_optional:
            return UserInvitationCreateRequest(
                data = openapi_client.models.user_invitation_create_request_data.UserInvitationCreateRequest_data(
                    attributes = openapi_client.models.user_invitation_create_request_data_attributes.UserInvitationCreateRequest_data_attributes(
                        all_apps_visible = True, 
                        email = '', 
                        first_name = '', 
                        last_name = '', 
                        provisioning_allowed = True, 
                        roles = [
                            'ADMIN'
                            ], ), 
                    relationships = openapi_client.models.user_invitation_create_request_data_relationships.UserInvitationCreateRequest_data_relationships(
                        visible_apps = openapi_client.models.user_invitation_create_request_data_relationships_visible_apps.UserInvitationCreateRequest_data_relationships_visibleApps(
                            data = [
                                openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                                    id = '', 
                                    type = 'apps', )
                                ], ), ), 
                    type = 'userInvitations', )
            )
        else:
            return UserInvitationCreateRequest(
                data = openapi_client.models.user_invitation_create_request_data.UserInvitationCreateRequest_data(
                    attributes = openapi_client.models.user_invitation_create_request_data_attributes.UserInvitationCreateRequest_data_attributes(
                        all_apps_visible = True, 
                        email = '', 
                        first_name = '', 
                        last_name = '', 
                        provisioning_allowed = True, 
                        roles = [
                            'ADMIN'
                            ], ), 
                    relationships = openapi_client.models.user_invitation_create_request_data_relationships.UserInvitationCreateRequest_data_relationships(
                        visible_apps = openapi_client.models.user_invitation_create_request_data_relationships_visible_apps.UserInvitationCreateRequest_data_relationships_visibleApps(
                            data = [
                                openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                                    id = '', 
                                    type = 'apps', )
                                ], ), ), 
                    type = 'userInvitations', ),
        )
        """

    def testUserInvitationCreateRequest(self):
        """Test UserInvitationCreateRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
