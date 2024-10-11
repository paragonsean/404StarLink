# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.branch_protection import BranchProtection

class TestBranchProtection(unittest.TestCase):
    """BranchProtection unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BranchProtection:
        """Test BranchProtection
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BranchProtection`
        """
        model = BranchProtection()
        if include_optional:
            return BranchProtection(
                allow_deletions = openapi_client.models.branch_protection_allow_deletions.branch_protection_allow_deletions(
                    enabled = True, ),
                allow_force_pushes = openapi_client.models.branch_protection_allow_deletions.branch_protection_allow_deletions(
                    enabled = True, ),
                block_creations = openapi_client.models.branch_protection_allow_deletions.branch_protection_allow_deletions(
                    enabled = True, ),
                enabled = True,
                enforce_admins = openapi_client.models.protected_branch_admin_enforced.Protected Branch Admin Enforced(
                    enabled = True, 
                    url = 'https://api.github.com/repos/octocat/Hello-World/branches/master/protection/enforce_admins', ),
                name = '"branch/with/protection"',
                protection_url = '"https://api.github.com/repos/owner-79e94e2d36b3fd06a32bb213/AAA_Public_Repo/branches/branch/with/protection/protection"',
                required_conversation_resolution = openapi_client.models.branch_protection_allow_deletions.branch_protection_allow_deletions(
                    enabled = True, ),
                required_linear_history = openapi_client.models.branch_protection_allow_deletions.branch_protection_allow_deletions(
                    enabled = True, ),
                required_pull_request_reviews = openapi_client.models.protected_branch_pull_request_review.Protected Branch Pull Request Review(
                    bypass_pull_request_allowances = openapi_client.models.protected_branch_pull_request_review_bypass_pull_request_allowances.protected_branch_pull_request_review_bypass_pull_request_allowances(
                        apps = [
                            openapi_client.models.git_hub_app.GitHub app(
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
                                webhook_secret = '"6fba8f2fc8a7e8f2cca5577eddd82ca7586b3b6b"', )
                            ], 
                        teams = [
                            openapi_client.models.team.Team(
                                description = '', 
                                html_url = 'https://github.com/orgs/rails/teams/core', 
                                id = 56, 
                                members_url = '', 
                                name = '', 
                                node_id = '', 
                                parent = openapi_client.models.team_simple.Team Simple(
                                    description = 'A great team.', 
                                    html_url = 'https://github.com/orgs/rails/teams/core', 
                                    id = 1, 
                                    ldap_dn = 'uid=example,ou=users,dc=github,dc=com', 
                                    members_url = 'https://api.github.com/organizations/1/team/1/members{/member}', 
                                    name = 'Justice League', 
                                    node_id = 'MDQ6VGVhbTE=', 
                                    permission = 'admin', 
                                    privacy = 'closed', 
                                    repositories_url = 'https://api.github.com/organizations/1/team/1/repos', 
                                    slug = 'justice-league', 
                                    url = 'https://api.github.com/organizations/1/team/1', ), 
                                permission = '', 
                                privacy = '', 
                                repositories_url = '', 
                                slug = '', 
                                url = '', )
                            ], 
                        users = [
                            openapi_client.models.simple_user.Simple User(
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
                                url = 'https://api.github.com/users/octocat', )
                            ], ), 
                    dismiss_stale_reviews = True, 
                    dismissal_restrictions = openapi_client.models.protected_branch_pull_request_review_dismissal_restrictions.protected_branch_pull_request_review_dismissal_restrictions(
                        teams_url = '"https://api.github.com/repos/the-org/an-org-repo/branches/master/protection/dismissal_restrictions/teams"', 
                        url = '"https://api.github.com/repos/the-org/an-org-repo/branches/master/protection/dismissal_restrictions"', 
                        users_url = '"https://api.github.com/repos/the-org/an-org-repo/branches/master/protection/dismissal_restrictions/users"', ), 
                    require_code_owner_reviews = True, 
                    required_approving_review_count = 2, 
                    url = 'https://api.github.com/repos/octocat/Hello-World/branches/master/protection/dismissal_restrictions', ),
                required_signatures = openapi_client.models.branch_protection_required_signatures.branch_protection_required_signatures(
                    enabled = True, 
                    url = 'https://api.github.com/repos/octocat/Hello-World/branches/master/protection/required_signatures', ),
                required_status_checks = openapi_client.models.protected_branch_required_status_check.Protected Branch Required Status Check(
                    checks = [
                        openapi_client.models.protected_branch_required_status_check_checks_inner.protected_branch_required_status_check_checks_inner(
                            app_id = 56, 
                            context = '', )
                        ], 
                    contexts = [
                        ''
                        ], 
                    contexts_url = '', 
                    enforcement_level = '', 
                    strict = True, 
                    url = '', ),
                restrictions = openapi_client.models.branch_restriction_policy.Branch Restriction Policy(
                    apps = [
                        openapi_client.models.branch_restriction_policy_apps_inner.branch_restriction_policy_apps_inner(
                            created_at = '', 
                            description = '', 
                            events = [
                                ''
                                ], 
                            external_url = '', 
                            html_url = '', 
                            id = 56, 
                            name = '', 
                            node_id = '', 
                            owner = openapi_client.models.branch_restriction_policy_apps_inner_owner.branch_restriction_policy_apps_inner_owner(
                                avatar_url = '', 
                                description = '', 
                                events_url = '', 
                                followers_url = '"https://api.github.com/users/testorg-ea8ec76d71c3af4b/followers"', 
                                following_url = '"https://api.github.com/users/testorg-ea8ec76d71c3af4b/following{/other_user}"', 
                                gists_url = '"https://api.github.com/users/testorg-ea8ec76d71c3af4b/gists{/gist_id}"', 
                                gravatar_id = '""', 
                                hooks_url = '', 
                                html_url = '"https://github.com/testorg-ea8ec76d71c3af4b"', 
                                id = 56, 
                                issues_url = '', 
                                login = '', 
                                members_url = '', 
                                node_id = '', 
                                organizations_url = '"https://api.github.com/users/testorg-ea8ec76d71c3af4b/orgs"', 
                                public_members_url = '', 
                                received_events_url = '"https://api.github.com/users/testorg-ea8ec76d71c3af4b/received_events"', 
                                repos_url = '', 
                                site_admin = False, 
                                starred_url = '"https://api.github.com/users/testorg-ea8ec76d71c3af4b/starred{/owner}{/repo}"', 
                                subscriptions_url = '"https://api.github.com/users/testorg-ea8ec76d71c3af4b/subscriptions"', 
                                type = '"Organization"', 
                                url = '', ), 
                            permissions = openapi_client.models.branch_restriction_policy_apps_inner_permissions.branch_restriction_policy_apps_inner_permissions(
                                contents = '', 
                                issues = '', 
                                metadata = '', 
                                single_file = '', ), 
                            slug = '', 
                            updated_at = '', )
                        ], 
                    apps_url = '', 
                    teams = [
                        openapi_client.models.branch_restriction_policy_teams_inner.branch_restriction_policy_teams_inner(
                            description = '', 
                            html_url = '', 
                            id = 56, 
                            members_url = '', 
                            name = '', 
                            node_id = '', 
                            parent = '', 
                            permission = '', 
                            privacy = '', 
                            repositories_url = '', 
                            slug = '', 
                            url = '', )
                        ], 
                    teams_url = '', 
                    url = '', 
                    users = [
                        openapi_client.models.branch_restriction_policy_users_inner.branch_restriction_policy_users_inner(
                            avatar_url = '', 
                            events_url = '', 
                            followers_url = '', 
                            following_url = '', 
                            gists_url = '', 
                            gravatar_id = '', 
                            html_url = '', 
                            id = 56, 
                            login = '', 
                            node_id = '', 
                            organizations_url = '', 
                            received_events_url = '', 
                            repos_url = '', 
                            site_admin = True, 
                            starred_url = '', 
                            subscriptions_url = '', 
                            type = '', 
                            url = '', )
                        ], 
                    users_url = '', ),
                url = ''
            )
        else:
            return BranchProtection(
        )
        """

    def testBranchProtection(self):
        """Test BranchProtection"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
