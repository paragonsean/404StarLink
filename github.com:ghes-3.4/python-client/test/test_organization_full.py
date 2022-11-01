# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.organization_full import OrganizationFull

class TestOrganizationFull(unittest.TestCase):
    """OrganizationFull unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OrganizationFull:
        """Test OrganizationFull
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OrganizationFull`
        """
        model = OrganizationFull()
        if include_optional:
            return OrganizationFull(
                avatar_url = 'https://github.com/images/error/octocat_happy.gif',
                billing_email = 'org@example.com',
                blog = 'https://github.com/blog',
                collaborators = 8,
                company = 'GitHub',
                created_at = '2008-01-14T04:33:35Z',
                default_repository_permission = '',
                description = 'A great organization',
                disk_usage = 10000,
                email = 'octocat@github.com',
                events_url = 'https://api.github.com/orgs/github/events',
                followers = 20,
                following = 0,
                has_organization_projects = True,
                has_repository_projects = True,
                hooks_url = 'https://api.github.com/orgs/github/hooks',
                html_url = 'https://github.com/octocat',
                id = 1,
                is_verified = True,
                issues_url = 'https://api.github.com/orgs/github/issues',
                location = 'San Francisco',
                login = 'github',
                members_allowed_repository_creation_type = 'all',
                members_can_create_internal_repositories = True,
                members_can_create_pages = True,
                members_can_create_private_pages = True,
                members_can_create_private_repositories = True,
                members_can_create_public_pages = True,
                members_can_create_public_repositories = True,
                members_can_create_repositories = True,
                members_can_fork_private_repositories = False,
                members_url = 'https://api.github.com/orgs/github/members{/member}',
                name = 'github',
                node_id = 'MDEyOk9yZ2FuaXphdGlvbjE=',
                owned_private_repos = 100,
                plan = openapi_client.models.organization_full_plan.organization_full_plan(
                    filled_seats = 56, 
                    name = '', 
                    private_repos = 56, 
                    seats = 56, 
                    space = 56, ),
                private_gists = 81,
                public_gists = 1,
                public_members_url = 'https://api.github.com/orgs/github/public_members{/member}',
                public_repos = 2,
                repos_url = 'https://api.github.com/orgs/github/repos',
                total_private_repos = 100,
                twitter_username = 'github',
                two_factor_requirement_enabled = True,
                type = 'Organization',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                url = 'https://api.github.com/orgs/github'
            )
        else:
            return OrganizationFull(
                avatar_url = 'https://github.com/images/error/octocat_happy.gif',
                created_at = '2008-01-14T04:33:35Z',
                description = 'A great organization',
                events_url = 'https://api.github.com/orgs/github/events',
                followers = 20,
                following = 0,
                has_organization_projects = True,
                has_repository_projects = True,
                hooks_url = 'https://api.github.com/orgs/github/hooks',
                html_url = 'https://github.com/octocat',
                id = 1,
                issues_url = 'https://api.github.com/orgs/github/issues',
                login = 'github',
                members_url = 'https://api.github.com/orgs/github/members{/member}',
                node_id = 'MDEyOk9yZ2FuaXphdGlvbjE=',
                public_gists = 1,
                public_members_url = 'https://api.github.com/orgs/github/public_members{/member}',
                public_repos = 2,
                repos_url = 'https://api.github.com/orgs/github/repos',
                type = 'Organization',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                url = 'https://api.github.com/orgs/github',
        )
        """

    def testOrganizationFull(self):
        """Test OrganizationFull"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
