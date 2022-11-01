# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.actions_organization_permissions import ActionsOrganizationPermissions

class TestActionsOrganizationPermissions(unittest.TestCase):
    """ActionsOrganizationPermissions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ActionsOrganizationPermissions:
        """Test ActionsOrganizationPermissions
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ActionsOrganizationPermissions`
        """
        model = ActionsOrganizationPermissions()
        if include_optional:
            return ActionsOrganizationPermissions(
                allowed_actions = 'all',
                enabled_repositories = 'all',
                selected_actions_url = '',
                selected_repositories_url = ''
            )
        else:
            return ActionsOrganizationPermissions(
                enabled_repositories = 'all',
        )
        """

    def testActionsOrganizationPermissions(self):
        """Test ActionsOrganizationPermissions"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
