# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.organization_actions_secret import OrganizationActionsSecret

class TestOrganizationActionsSecret(unittest.TestCase):
    """OrganizationActionsSecret unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OrganizationActionsSecret:
        """Test OrganizationActionsSecret
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OrganizationActionsSecret`
        """
        model = OrganizationActionsSecret()
        if include_optional:
            return OrganizationActionsSecret(
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                name = 'SECRET_TOKEN',
                selected_repositories_url = 'https://api.github.com/organizations/org/secrets/my_secret/repositories',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                visibility = 'all'
            )
        else:
            return OrganizationActionsSecret(
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                name = 'SECRET_TOKEN',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                visibility = 'all',
        )
        """

    def testOrganizationActionsSecret(self):
        """Test OrganizationActionsSecret"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
