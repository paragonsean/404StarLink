# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.issue import Issue

class TestIssue(unittest.TestCase):
    """Issue unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Issue:
        """Test Issue
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Issue`
        """
        model = Issue()
        if include_optional:
            return Issue(
                active_lock_reason = '',
                assignee = openapi_client.models.simple_user.Simple User(
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
                assignees = [
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
                    ],
                author_association = 'OWNER',
                body = 'It looks like the new widget form is broken on Safari. When I try and create the widget, Safari crashes. This is reproducible on 10.8, but not 10.9. Maybe a browser bug?',
                body_html = '',
                body_text = '',
                closed_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                closed_by = openapi_client.models.simple_user.Simple User(
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
                comments = 56,
                comments_url = '',
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                draft = True,
                events_url = '',
                html_url = '',
                id = 56,
                labels = ["bug","registration"],
                labels_url = '',
                locked = True,
                milestone = openapi_client.models.milestone.Milestone(
                    closed_at = '2013-02-12T13:22:01Z', 
                    closed_issues = 8, 
                    created_at = '2011-04-10T20:09:31Z', 
                    creator = openapi_client.models.simple_user.Simple User(
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
                    description = 'Tracking milestone for version 1.0', 
                    due_on = '2012-10-09T23:39:01Z', 
                    html_url = 'https://github.com/octocat/Hello-World/milestones/v1.0', 
                    id = 1002604, 
                    labels_url = 'https://api.github.com/repos/octocat/Hello-World/milestones/1/labels', 
                    node_id = 'MDk6TWlsZXN0b25lMTAwMjYwNA==', 
                    number = 42, 
                    open_issues = 4, 
                    state = 'open', 
                    title = 'v1.0', 
                    updated_at = '2014-03-03T18:58:10Z', 
                    url = 'https://api.github.com/repos/octocat/Hello-World/milestones/1', ),
                node_id = '',
                number = 42,
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
                pull_request = openapi_client.models.issue_pull_request.issue_pull_request(
                    diff_url = '', 
                    html_url = '', 
                    merged_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    patch_url = '', 
                    url = '', ),
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
                repository = openapi_client.models.repository.Repository(
                    allow_auto_merge = False, 
                    allow_forking = True, 
                    allow_merge_commit = True, 
                    allow_rebase_merge = True, 
                    allow_squash_merge = True, 
                    allow_update_branch = False, 
                    anonymous_access_enabled = True, 
                    archive_url = 'http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}', 
                    archived = True, 
                    assignees_url = 'http://api.github.com/repos/octocat/Hello-World/assignees{/user}', 
                    blobs_url = 'http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}', 
                    branches_url = 'http://api.github.com/repos/octocat/Hello-World/branches{/branch}', 
                    clone_url = 'https://github.com/octocat/Hello-World.git', 
                    collaborators_url = 'http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}', 
                    comments_url = 'http://api.github.com/repos/octocat/Hello-World/comments{/number}', 
                    commits_url = 'http://api.github.com/repos/octocat/Hello-World/commits{/sha}', 
                    compare_url = 'http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}', 
                    contents_url = 'http://api.github.com/repos/octocat/Hello-World/contents/{+path}', 
                    contributors_url = 'http://api.github.com/repos/octocat/Hello-World/contributors', 
                    created_at = '2011-01-26T19:01:12Z', 
                    default_branch = 'master', 
                    delete_branch_on_merge = False, 
                    deployments_url = 'http://api.github.com/repos/octocat/Hello-World/deployments', 
                    description = 'This your first repo!', 
                    disabled = True, 
                    downloads_url = 'http://api.github.com/repos/octocat/Hello-World/downloads', 
                    events_url = 'http://api.github.com/repos/octocat/Hello-World/events', 
                    fork = True, 
                    forks = 56, 
                    forks_count = 9, 
                    forks_url = 'http://api.github.com/repos/octocat/Hello-World/forks', 
                    full_name = 'octocat/Hello-World', 
                    git_commits_url = 'http://api.github.com/repos/octocat/Hello-World/git/commits{/sha}', 
                    git_refs_url = 'http://api.github.com/repos/octocat/Hello-World/git/refs{/sha}', 
                    git_tags_url = 'http://api.github.com/repos/octocat/Hello-World/git/tags{/sha}', 
                    git_url = 'git:github.com/octocat/Hello-World.git', 
                    has_downloads = True, 
                    has_issues = True, 
                    has_pages = True, 
                    has_projects = True, 
                    has_wiki = True, 
                    homepage = 'https://github.com', 
                    hooks_url = 'http://api.github.com/repos/octocat/Hello-World/hooks', 
                    html_url = 'https://github.com/octocat/Hello-World', 
                    id = 42, 
                    is_template = True, 
                    issue_comment_url = 'http://api.github.com/repos/octocat/Hello-World/issues/comments{/number}', 
                    issue_events_url = 'http://api.github.com/repos/octocat/Hello-World/issues/events{/number}', 
                    issues_url = 'http://api.github.com/repos/octocat/Hello-World/issues{/number}', 
                    keys_url = 'http://api.github.com/repos/octocat/Hello-World/keys{/key_id}', 
                    labels_url = 'http://api.github.com/repos/octocat/Hello-World/labels{/name}', 
                    language = '', 
                    languages_url = 'http://api.github.com/repos/octocat/Hello-World/languages', 
                    license = openapi_client.models.license_simple.License Simple(
                        html_url = '', 
                        key = 'mit', 
                        name = 'MIT License', 
                        node_id = 'MDc6TGljZW5zZW1pdA==', 
                        spdx_id = 'MIT', 
                        url = 'https://api.github.com/licenses/mit', ), 
                    master_branch = '', 
                    merges_url = 'http://api.github.com/repos/octocat/Hello-World/merges', 
                    milestones_url = 'http://api.github.com/repos/octocat/Hello-World/milestones{/number}', 
                    mirror_url = 'git:git.example.com/octocat/Hello-World', 
                    name = 'Team Environment', 
                    network_count = 56, 
                    node_id = 'MDEwOlJlcG9zaXRvcnkxMjk2MjY5', 
                    notifications_url = 'http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}', 
                    open_issues = 56, 
                    open_issues_count = 0, 
                    organization = openapi_client.models.simple_user.Simple User(
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
                    permissions = openapi_client.models.collaborator_permissions.collaborator_permissions(
                        admin = True, 
                        maintain = True, 
                        pull = True, 
                        push = True, 
                        triage = True, ), 
                    private = True, 
                    pulls_url = 'http://api.github.com/repos/octocat/Hello-World/pulls{/number}', 
                    pushed_at = '2011-01-26T19:06:43Z', 
                    releases_url = 'http://api.github.com/repos/octocat/Hello-World/releases{/id}', 
                    size = 108, 
                    ssh_url = 'git@github.com:octocat/Hello-World.git', 
                    stargazers_count = 80, 
                    stargazers_url = 'http://api.github.com/repos/octocat/Hello-World/stargazers', 
                    starred_at = '"2020-07-09T00:17:42Z"', 
                    statuses_url = 'http://api.github.com/repos/octocat/Hello-World/statuses/{sha}', 
                    subscribers_count = 56, 
                    subscribers_url = 'http://api.github.com/repos/octocat/Hello-World/subscribers', 
                    subscription_url = 'http://api.github.com/repos/octocat/Hello-World/subscription', 
                    svn_url = 'https://svn.github.com/octocat/Hello-World', 
                    tags_url = 'http://api.github.com/repos/octocat/Hello-World/tags', 
                    teams_url = 'http://api.github.com/repos/octocat/Hello-World/teams', 
                    temp_clone_token = '', 
                    template_repository = openapi_client.models.nullable_repository_template_repository.nullable_repository_template_repository(
                        allow_auto_merge = True, 
                        allow_merge_commit = True, 
                        allow_rebase_merge = True, 
                        allow_squash_merge = True, 
                        allow_update_branch = True, 
                        archive_url = '', 
                        archived = True, 
                        assignees_url = '', 
                        blobs_url = '', 
                        branches_url = '', 
                        clone_url = '', 
                        collaborators_url = '', 
                        comments_url = '', 
                        commits_url = '', 
                        compare_url = '', 
                        contents_url = '', 
                        contributors_url = '', 
                        created_at = '', 
                        default_branch = '', 
                        delete_branch_on_merge = True, 
                        deployments_url = '', 
                        description = '', 
                        disabled = True, 
                        downloads_url = '', 
                        events_url = '', 
                        fork = True, 
                        forks_count = 56, 
                        forks_url = '', 
                        full_name = '', 
                        git_commits_url = '', 
                        git_refs_url = '', 
                        git_tags_url = '', 
                        git_url = '', 
                        has_downloads = True, 
                        has_issues = True, 
                        has_pages = True, 
                        has_projects = True, 
                        has_wiki = True, 
                        homepage = '', 
                        hooks_url = '', 
                        html_url = '', 
                        id = 56, 
                        is_template = True, 
                        issue_comment_url = '', 
                        issue_events_url = '', 
                        issues_url = '', 
                        keys_url = '', 
                        labels_url = '', 
                        language = '', 
                        languages_url = '', 
                        merges_url = '', 
                        milestones_url = '', 
                        mirror_url = '', 
                        name = '', 
                        network_count = 56, 
                        node_id = '', 
                        notifications_url = '', 
                        open_issues_count = 56, 
                        private = True, 
                        pulls_url = '', 
                        pushed_at = '', 
                        releases_url = '', 
                        size = 56, 
                        ssh_url = '', 
                        stargazers_count = 56, 
                        stargazers_url = '', 
                        statuses_url = '', 
                        subscribers_count = 56, 
                        subscribers_url = '', 
                        subscription_url = '', 
                        svn_url = '', 
                        tags_url = '', 
                        teams_url = '', 
                        temp_clone_token = '', 
                        topics = [
                            ''
                            ], 
                        trees_url = '', 
                        updated_at = '', 
                        url = '', 
                        visibility = '', 
                        watchers_count = 56, ), 
                    topics = [
                        ''
                        ], 
                    trees_url = 'http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}', 
                    updated_at = '2011-01-26T19:14:43Z', 
                    url = 'https://api.github.com/repos/octocat/Hello-World', 
                    visibility = 'public', 
                    watchers = 56, 
                    watchers_count = 80, ),
                repository_url = '',
                state = 'open',
                state_reason = 'not_planned',
                timeline_url = '',
                title = 'Widget creation fails in Safari on OS X 10.8',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                url = 'https://api.github.com/repositories/42/issues/1',
                user = openapi_client.models.simple_user.Simple User(
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
            )
        else:
            return Issue(
                assignee = openapi_client.models.simple_user.Simple User(
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
                author_association = 'OWNER',
                closed_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                comments = 56,
                comments_url = '',
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                events_url = '',
                html_url = '',
                id = 56,
                labels = ["bug","registration"],
                labels_url = '',
                locked = True,
                milestone = openapi_client.models.milestone.Milestone(
                    closed_at = '2013-02-12T13:22:01Z', 
                    closed_issues = 8, 
                    created_at = '2011-04-10T20:09:31Z', 
                    creator = openapi_client.models.simple_user.Simple User(
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
                    description = 'Tracking milestone for version 1.0', 
                    due_on = '2012-10-09T23:39:01Z', 
                    html_url = 'https://github.com/octocat/Hello-World/milestones/v1.0', 
                    id = 1002604, 
                    labels_url = 'https://api.github.com/repos/octocat/Hello-World/milestones/1/labels', 
                    node_id = 'MDk6TWlsZXN0b25lMTAwMjYwNA==', 
                    number = 42, 
                    open_issues = 4, 
                    state = 'open', 
                    title = 'v1.0', 
                    updated_at = '2014-03-03T18:58:10Z', 
                    url = 'https://api.github.com/repos/octocat/Hello-World/milestones/1', ),
                node_id = '',
                number = 42,
                repository_url = '',
                state = 'open',
                title = 'Widget creation fails in Safari on OS X 10.8',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                url = 'https://api.github.com/repositories/42/issues/1',
                user = openapi_client.models.simple_user.Simple User(
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
        )
        """

    def testIssue(self):
        """Test Issue"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
