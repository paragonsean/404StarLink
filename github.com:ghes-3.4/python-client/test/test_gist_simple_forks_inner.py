# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.gist_simple_forks_inner import GistSimpleForksInner

class TestGistSimpleForksInner(unittest.TestCase):
    """GistSimpleForksInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GistSimpleForksInner:
        """Test GistSimpleForksInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GistSimpleForksInner`
        """
        model = GistSimpleForksInner()
        if include_optional:
            return GistSimpleForksInner(
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                id = '',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                url = '',
                user = openapi_client.models.public_user.Public User(
                    avatar_url = '', 
                    bio = '', 
                    blog = '', 
                    collaborators = 3, 
                    company = '', 
                    created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    disk_usage = 1, 
                    email = '', 
                    events_url = '', 
                    followers = 56, 
                    followers_url = '', 
                    following = 56, 
                    following_url = '', 
                    gists_url = '', 
                    gravatar_id = '', 
                    hireable = True, 
                    html_url = '', 
                    id = 56, 
                    location = '', 
                    login = '', 
                    name = '', 
                    node_id = '', 
                    organizations_url = '', 
                    owned_private_repos = 2, 
                    plan = openapi_client.models.ldap_mapping_user_plan.ldap_mapping_user_plan(
                        collaborators = 56, 
                        name = '', 
                        private_repos = 56, 
                        space = 56, ), 
                    private_gists = 1, 
                    public_gists = 56, 
                    public_repos = 56, 
                    received_events_url = '', 
                    repos_url = '', 
                    site_admin = True, 
                    starred_url = '', 
                    subscriptions_url = '', 
                    suspended_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    total_private_repos = 2, 
                    twitter_username = '', 
                    type = '', 
                    updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    url = '', )
            )
        else:
            return GistSimpleForksInner(
        )
        """

    def testGistSimpleForksInner(self):
        """Test GistSimpleForksInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
