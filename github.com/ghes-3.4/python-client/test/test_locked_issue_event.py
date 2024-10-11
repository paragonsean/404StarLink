# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.locked_issue_event import LockedIssueEvent

class TestLockedIssueEvent(unittest.TestCase):
    """LockedIssueEvent unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> LockedIssueEvent:
        """Test LockedIssueEvent
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `LockedIssueEvent`
        """
        model = LockedIssueEvent()
        if include_optional:
            return LockedIssueEvent(
                actor = openapi_client.models.simple_user.Simple User(
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
                commit_id = '',
                commit_url = '',
                created_at = '',
                event = '',
                id = 56,
                lock_reason = '"off-topic"',
                node_id = '',
                performed_via_github_app = openapi_client.models.git_hub_app.GitHub app(
                    client_id = '"Iv1.25b5d1e65ffc4022"', 
                    client_secret = '"1d4b2097ac622ba702d19de498f005747a8b21d3"', 
                    created_at = '2017-07-08T16:18:44-04:00', 
                    description = 'The description of the app.', 
                    events = ["label","deployment"], 
                    external_url = 'https://example.com', 
                    html_url = 'https://github.com/apps/super-ci', 
                    id = 37, 
                    installations_count = 5, 
                    name = 'Probot Owners', 
                    node_id = 'MDExOkludGVncmF0aW9uMQ==', 
                    owner = openapi_client.models.simple_user.Simple User(
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
                    pem = '"-----BEGIN RSA PRIVATE KEY-----\nMIIEogIBAAKCAQEArYxrNYD/iT5CZVpRJu4rBKmmze3PVmT/gCo2ATUvDvZTPTey\nxcGJ3vvrJXazKk06pN05TN29o98jrYz4cengG3YGsXPNEpKsIrEl8NhbnxapEnM9\nJCMRe0P5JcPsfZlX6hmiT7136GRWiGOUba2X9+HKh8QJVLG5rM007TBER9/z9mWm\nrJuNh+m5l320oBQY/Qq3A7wzdEfZw8qm/mIN0FCeoXH1L6B8xXWaAYBwhTEh6SSn\nZHlO1Xu1JWDmAvBCi0RO5aRSKM8q9QEkvvHP4yweAtK3N8+aAbZ7ovaDhyGz8r6r\nzhU1b8Uo0Z2ysf503WqzQgIajr7Fry7/kUwpgQIDAQABAoIBADwJp80Ko1xHPZDy\nfcCKBDfIuPvkmSW6KumbsLMaQv1aGdHDwwTGv3t0ixSay8CGlxMRtRDyZPib6SvQ\n6OH/lpfpbMdW2ErkksgtoIKBVrDilfrcAvrNZu7NxRNbhCSvN8q0s4ICecjbbVQh\nnueSdlA6vGXbW58BHMq68uRbHkP+k+mM9U0mDJ1HMch67wlg5GbayVRt63H7R2+r\nVxcna7B80J/lCEjIYZznawgiTvp3MSanTglqAYi+m1EcSsP14bJIB9vgaxS79kTu\noiSo93leJbBvuGo8QEiUqTwMw4tDksmkLsoqNKQ1q9P7LZ9DGcujtPy4EZsamSJT\ny8OJt0ECgYEA2lxOxJsQk2kI325JgKFjo92mQeUObIvPfSNWUIZQDTjniOI6Gv63\nGLWVFrZcvQBWjMEQraJA9xjPbblV8PtfO87MiJGLWCHFxmPz2dzoedN+2Coxom8m\nV95CLz8QUShuao6u/RYcvUaZEoYs5bHcTmy5sBK80JyEmafJPtCQVxMCgYEAy3ar\nZr3yv4xRPEPMat4rseswmuMooSaK3SKub19WFI5IAtB/e7qR1Rj9JhOGcZz+OQrl\nT78O2OFYlgOIkJPvRMrPpK5V9lslc7tz1FSh3BZMRGq5jSyD7ETSOQ0c8T2O/s7v\nbeEPbVbDe4mwvM24XByH0GnWveVxaDl51ABD65sCgYB3ZAspUkOA5egVCh8kNpnd\nSd6SnuQBE3ySRlT2WEnCwP9Ph6oPgn+oAfiPX4xbRqkL8q/k0BdHQ4h+zNwhk7+h\nWtPYRAP1Xxnc/F+jGjb+DVaIaKGU18MWPg7f+FI6nampl3Q0KvfxwX0GdNhtio8T\nTj1E+SnFwh56SRQuxSh2gwKBgHKjlIO5NtNSflsUYFM+hyQiPiqnHzddfhSG+/3o\nm5nNaSmczJesUYreH5San7/YEy2UxAugvP7aSY2MxB+iGsiJ9WD2kZzTUlDZJ7RV\nUzWsoqBR+eZfVJ2FUWWvy8TpSG6trh4dFxImNtKejCR1TREpSiTV3Zb1dmahK9GV\nrK9NAoGAbBxRLoC01xfxCTgt5BDiBcFVh4fp5yYKwavJPLzHSpuDOrrI9jDn1oKN\nonq5sDU1i391zfQvdrbX4Ova48BN+B7p63FocP/MK5tyyBoT8zQEk2+vWDOw7H/Z\nu5dTCPxTIsoIwUw1I+7yIxqJzLPFgR2gVBwY1ra/8iAqCj+zeBw=\n-----END RSA PRIVATE KEY-----\n"', 
                    permissions = {"deployments":"write","issues":"read"}, 
                    slug = 'probot-owners', 
                    updated_at = '2017-07-08T16:18:44-04:00', 
                    webhook_secret = '"6fba8f2fc8a7e8f2cca5577eddd82ca7586b3b6b"', ),
                url = ''
            )
        else:
            return LockedIssueEvent(
                actor = openapi_client.models.simple_user.Simple User(
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
                commit_id = '',
                commit_url = '',
                created_at = '',
                event = '',
                id = 56,
                lock_reason = '"off-topic"',
                node_id = '',
                performed_via_github_app = openapi_client.models.git_hub_app.GitHub app(
                    client_id = '"Iv1.25b5d1e65ffc4022"', 
                    client_secret = '"1d4b2097ac622ba702d19de498f005747a8b21d3"', 
                    created_at = '2017-07-08T16:18:44-04:00', 
                    description = 'The description of the app.', 
                    events = ["label","deployment"], 
                    external_url = 'https://example.com', 
                    html_url = 'https://github.com/apps/super-ci', 
                    id = 37, 
                    installations_count = 5, 
                    name = 'Probot Owners', 
                    node_id = 'MDExOkludGVncmF0aW9uMQ==', 
                    owner = openapi_client.models.simple_user.Simple User(
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
                    pem = '"-----BEGIN RSA PRIVATE KEY-----\nMIIEogIBAAKCAQEArYxrNYD/iT5CZVpRJu4rBKmmze3PVmT/gCo2ATUvDvZTPTey\nxcGJ3vvrJXazKk06pN05TN29o98jrYz4cengG3YGsXPNEpKsIrEl8NhbnxapEnM9\nJCMRe0P5JcPsfZlX6hmiT7136GRWiGOUba2X9+HKh8QJVLG5rM007TBER9/z9mWm\nrJuNh+m5l320oBQY/Qq3A7wzdEfZw8qm/mIN0FCeoXH1L6B8xXWaAYBwhTEh6SSn\nZHlO1Xu1JWDmAvBCi0RO5aRSKM8q9QEkvvHP4yweAtK3N8+aAbZ7ovaDhyGz8r6r\nzhU1b8Uo0Z2ysf503WqzQgIajr7Fry7/kUwpgQIDAQABAoIBADwJp80Ko1xHPZDy\nfcCKBDfIuPvkmSW6KumbsLMaQv1aGdHDwwTGv3t0ixSay8CGlxMRtRDyZPib6SvQ\n6OH/lpfpbMdW2ErkksgtoIKBVrDilfrcAvrNZu7NxRNbhCSvN8q0s4ICecjbbVQh\nnueSdlA6vGXbW58BHMq68uRbHkP+k+mM9U0mDJ1HMch67wlg5GbayVRt63H7R2+r\nVxcna7B80J/lCEjIYZznawgiTvp3MSanTglqAYi+m1EcSsP14bJIB9vgaxS79kTu\noiSo93leJbBvuGo8QEiUqTwMw4tDksmkLsoqNKQ1q9P7LZ9DGcujtPy4EZsamSJT\ny8OJt0ECgYEA2lxOxJsQk2kI325JgKFjo92mQeUObIvPfSNWUIZQDTjniOI6Gv63\nGLWVFrZcvQBWjMEQraJA9xjPbblV8PtfO87MiJGLWCHFxmPz2dzoedN+2Coxom8m\nV95CLz8QUShuao6u/RYcvUaZEoYs5bHcTmy5sBK80JyEmafJPtCQVxMCgYEAy3ar\nZr3yv4xRPEPMat4rseswmuMooSaK3SKub19WFI5IAtB/e7qR1Rj9JhOGcZz+OQrl\nT78O2OFYlgOIkJPvRMrPpK5V9lslc7tz1FSh3BZMRGq5jSyD7ETSOQ0c8T2O/s7v\nbeEPbVbDe4mwvM24XByH0GnWveVxaDl51ABD65sCgYB3ZAspUkOA5egVCh8kNpnd\nSd6SnuQBE3ySRlT2WEnCwP9Ph6oPgn+oAfiPX4xbRqkL8q/k0BdHQ4h+zNwhk7+h\nWtPYRAP1Xxnc/F+jGjb+DVaIaKGU18MWPg7f+FI6nampl3Q0KvfxwX0GdNhtio8T\nTj1E+SnFwh56SRQuxSh2gwKBgHKjlIO5NtNSflsUYFM+hyQiPiqnHzddfhSG+/3o\nm5nNaSmczJesUYreH5San7/YEy2UxAugvP7aSY2MxB+iGsiJ9WD2kZzTUlDZJ7RV\nUzWsoqBR+eZfVJ2FUWWvy8TpSG6trh4dFxImNtKejCR1TREpSiTV3Zb1dmahK9GV\nrK9NAoGAbBxRLoC01xfxCTgt5BDiBcFVh4fp5yYKwavJPLzHSpuDOrrI9jDn1oKN\nonq5sDU1i391zfQvdrbX4Ova48BN+B7p63FocP/MK5tyyBoT8zQEk2+vWDOw7H/Z\nu5dTCPxTIsoIwUw1I+7yIxqJzLPFgR2gVBwY1ra/8iAqCj+zeBw=\n-----END RSA PRIVATE KEY-----\n"', 
                    permissions = {"deployments":"write","issues":"read"}, 
                    slug = 'probot-owners', 
                    updated_at = '2017-07-08T16:18:44-04:00', 
                    webhook_secret = '"6fba8f2fc8a7e8f2cca5577eddd82ca7586b3b6b"', ),
                url = '',
        )
        """

    def testLockedIssueEvent(self):
        """Test LockedIssueEvent"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
