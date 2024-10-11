# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.page_build import PageBuild

class TestPageBuild(unittest.TestCase):
    """PageBuild unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PageBuild:
        """Test PageBuild
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PageBuild`
        """
        model = PageBuild()
        if include_optional:
            return PageBuild(
                commit = '',
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                duration = 56,
                error = openapi_client.models.page_build_error.page_build_error(
                    message = '', ),
                pusher = openapi_client.models.simple_user.Simple User(
                    avatar_url = 'https://github.com/images/error/octocat_happy.gif', 
                    email = '', 
                    events_url = 'https://api.github.com/users/octocat/events{/privacy}', 
                    followers_url = 'https://api.github.com/users/octocat/followers', 
                    following_url = 'https://api.github.com/users/octocat/following{/other_user}', 
                    gists_url = 'https://api.github.com/users/octocat/gists{/gist_id}', 
                    gravatar_id = '41d064eb2195891e12d0413f63227ea7', 
                    html_url = 'https://github.com/octocat', 
                    id = 1, 
                    login = 'octocat', 
                    name = '', 
                    node_id = 'MDQ6VXNlcjE=', 
                    organizations_url = 'https://api.github.com/users/octocat/orgs', 
                    received_events_url = 'https://api.github.com/users/octocat/received_events', 
                    repos_url = 'https://api.github.com/users/octocat/repos', 
                    site_admin = True, 
                    starred_at = '"2020-07-09T00:17:55Z"', 
                    starred_url = 'https://api.github.com/users/octocat/starred{/owner}{/repo}', 
                    subscriptions_url = 'https://api.github.com/users/octocat/subscriptions', 
                    type = 'User', 
                    url = 'https://api.github.com/users/octocat', ),
                status = '',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                url = ''
            )
        else:
            return PageBuild(
                commit = '',
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                duration = 56,
                error = openapi_client.models.page_build_error.page_build_error(
                    message = '', ),
                pusher = openapi_client.models.simple_user.Simple User(
                    avatar_url = 'https://github.com/images/error/octocat_happy.gif', 
                    email = '', 
                    events_url = 'https://api.github.com/users/octocat/events{/privacy}', 
                    followers_url = 'https://api.github.com/users/octocat/followers', 
                    following_url = 'https://api.github.com/users/octocat/following{/other_user}', 
                    gists_url = 'https://api.github.com/users/octocat/gists{/gist_id}', 
                    gravatar_id = '41d064eb2195891e12d0413f63227ea7', 
                    html_url = 'https://github.com/octocat', 
                    id = 1, 
                    login = 'octocat', 
                    name = '', 
                    node_id = 'MDQ6VXNlcjE=', 
                    organizations_url = 'https://api.github.com/users/octocat/orgs', 
                    received_events_url = 'https://api.github.com/users/octocat/received_events', 
                    repos_url = 'https://api.github.com/users/octocat/repos', 
                    site_admin = True, 
                    starred_at = '"2020-07-09T00:17:55Z"', 
                    starred_url = 'https://api.github.com/users/octocat/starred{/owner}{/repo}', 
                    subscriptions_url = 'https://api.github.com/users/octocat/subscriptions', 
                    type = 'User', 
                    url = 'https://api.github.com/users/octocat', ),
                status = '',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                url = '',
        )
        """

    def testPageBuild(self):
        """Test PageBuild"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
