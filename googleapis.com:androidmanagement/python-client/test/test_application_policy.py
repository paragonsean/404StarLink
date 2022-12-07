# coding: utf-8

"""
    Android Management API

    The Android Management API provides remote enterprise management of Android devices and apps.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.application_policy import ApplicationPolicy

class TestApplicationPolicy(unittest.TestCase):
    """ApplicationPolicy unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ApplicationPolicy:
        """Test ApplicationPolicy
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ApplicationPolicy`
        """
        model = ApplicationPolicy()
        if include_optional:
            return ApplicationPolicy(
                accessible_track_ids = [
                    ''
                    ],
                always_on_vpn_lockdown_exemption = 'ALWAYS_ON_VPN_LOCKDOWN_EXEMPTION_UNSPECIFIED',
                auto_update_mode = 'AUTO_UPDATE_MODE_UNSPECIFIED',
                connected_work_and_personal_app = 'CONNECTED_WORK_AND_PERSONAL_APP_UNSPECIFIED',
                default_permission_policy = 'PERMISSION_POLICY_UNSPECIFIED',
                delegated_scopes = [
                    'DELEGATED_SCOPE_UNSPECIFIED'
                    ],
                disabled = True,
                extension_config = openapi_client.models.extension_config.ExtensionConfig(
                    notification_receiver = '', 
                    signing_key_fingerprints_sha256 = [
                        ''
                        ], ),
                install_type = 'INSTALL_TYPE_UNSPECIFIED',
                lock_task_allowed = True,
                managed_configuration = {
                    'key' : null
                    },
                managed_configuration_template = openapi_client.models.managed_configuration_template.ManagedConfigurationTemplate(
                    configuration_variables = {
                        'key' : ''
                        }, 
                    template_id = '', ),
                minimum_version_code = 56,
                package_name = '',
                permission_grants = [
                    openapi_client.models.permission_grant.PermissionGrant(
                        permission = '', 
                        policy = 'PERMISSION_POLICY_UNSPECIFIED', )
                    ],
                work_profile_widgets = 'WORK_PROFILE_WIDGETS_UNSPECIFIED'
            )
        else:
            return ApplicationPolicy(
        )
        """

    def testApplicationPolicy(self):
        """Test ApplicationPolicy"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
