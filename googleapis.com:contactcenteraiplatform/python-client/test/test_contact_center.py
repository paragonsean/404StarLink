# coding: utf-8

"""
    Contact Center AI Platform API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.contact_center import ContactCenter

class TestContactCenter(unittest.TestCase):
    """ContactCenter unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ContactCenter:
        """Test ContactCenter
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ContactCenter`
        """
        model = ContactCenter()
        if include_optional:
            return ContactCenter(
                admin_user = openapi_client.models.admin_user.AdminUser(
                    family_name = '', 
                    given_name = '', ),
                ccaip_managed_users = True,
                create_time = '',
                customer_domain_prefix = '',
                display_name = '',
                instance_config = openapi_client.models.instance_config.InstanceConfig(
                    instance_size = 'INSTANCE_SIZE_UNSPECIFIED', ),
                labels = {
                    'key' : ''
                    },
                name = '',
                saml_params = openapi_client.models.saml_params.SAMLParams(
                    certificate = '', 
                    entity_id = '', 
                    sso_uri = '', 
                    user_email = '', ),
                state = 'STATE_UNSPECIFIED',
                update_time = '',
                uris = openapi_client.models.uris.URIs(
                    chat_bot_uri = '', 
                    media_uri = '', 
                    root_uri = '', 
                    virtual_agent_streaming_service_uri = '', ),
                user_email = ''
            )
        else:
            return ContactCenter(
        )
        """

    def testContactCenter(self):
        """Test ContactCenter"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
