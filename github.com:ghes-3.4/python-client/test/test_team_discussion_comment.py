# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.team_discussion_comment import TeamDiscussionComment

class TestTeamDiscussionComment(unittest.TestCase):
    """TeamDiscussionComment unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TeamDiscussionComment:
        """Test TeamDiscussionComment
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TeamDiscussionComment`
        """
        model = TeamDiscussionComment()
        if include_optional:
            return TeamDiscussionComment(
                author = openapi_client.models.simple_user.Simple User(
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
                body = 'I agree with this suggestion.',
                body_html = '<p>Do you like apples?</p>',
                body_version = '0307116bbf7ced493b8d8a346c650b71',
                created_at = '2018-01-15T23:53:58Z',
                discussion_url = 'https://api.github.com/organizations/1/team/2403582/discussions/1',
                html_url = 'https://github.com/orgs/github/teams/justice-league/discussions/1/comments/1',
                last_edited_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                node_id = 'MDIxOlRlYW1EaXNjdXNzaW9uQ29tbWVudDE=',
                number = 42,
                reactions = openapi_client.models.reaction_rollup.Reaction Rollup(
                    +1 = 56, 
                    _1 = 56, 
                    confused = 56, 
                    eyes = 56, 
                    heart = 56, 
                    hooray = 56, 
                    laugh = 56, 
                    rocket = 56, 
                    total_count = 56, 
                    url = '', ),
                updated_at = '2018-01-15T23:53:58Z',
                url = 'https://api.github.com/organizations/1/team/2403582/discussions/1/comments/1'
            )
        else:
            return TeamDiscussionComment(
                author = openapi_client.models.simple_user.Simple User(
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
                body = 'I agree with this suggestion.',
                body_html = '<p>Do you like apples?</p>',
                body_version = '0307116bbf7ced493b8d8a346c650b71',
                created_at = '2018-01-15T23:53:58Z',
                discussion_url = 'https://api.github.com/organizations/1/team/2403582/discussions/1',
                html_url = 'https://github.com/orgs/github/teams/justice-league/discussions/1/comments/1',
                last_edited_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                node_id = 'MDIxOlRlYW1EaXNjdXNzaW9uQ29tbWVudDE=',
                number = 42,
                updated_at = '2018-01-15T23:53:58Z',
                url = 'https://api.github.com/organizations/1/team/2403582/discussions/1/comments/1',
        )
        """

    def testTeamDiscussionComment(self):
        """Test TeamDiscussionComment"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
