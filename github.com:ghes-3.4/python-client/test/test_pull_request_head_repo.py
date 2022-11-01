# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.pull_request_head_repo import PullRequestHeadRepo

class TestPullRequestHeadRepo(unittest.TestCase):
    """PullRequestHeadRepo unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PullRequestHeadRepo:
        """Test PullRequestHeadRepo
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PullRequestHeadRepo`
        """
        model = PullRequestHeadRepo()
        if include_optional:
            return PullRequestHeadRepo(
                allow_forking = True,
                allow_merge_commit = True,
                allow_rebase_merge = True,
                allow_squash_merge = True,
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
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                default_branch = '',
                deployments_url = '',
                description = '',
                disabled = True,
                downloads_url = '',
                events_url = '',
                fork = True,
                forks = 56,
                forks_count = 56,
                forks_url = '',
                full_name = '',
                git_commits_url = '',
                git_refs_url = '',
                git_tags_url = '',
                git_url = '',
                has_discussions = True,
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
                license = openapi_client.models.pull_request_head_repo_license.pull_request_head_repo_license(
                    key = '', 
                    name = '', 
                    node_id = '', 
                    spdx_id = '', 
                    url = '', ),
                master_branch = '',
                merges_url = '',
                milestones_url = '',
                mirror_url = '',
                name = '',
                node_id = '',
                notifications_url = '',
                open_issues = 56,
                open_issues_count = 56,
                owner = openapi_client.models.pull_request_base_repo_owner.pull_request_base_repo_owner(
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
                    url = '', ),
                permissions = openapi_client.models.collaborator_permissions.collaborator_permissions(
                    admin = True, 
                    maintain = True, 
                    pull = True, 
                    push = True, 
                    triage = True, ),
                private = True,
                pulls_url = '',
                pushed_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                releases_url = '',
                size = 56,
                ssh_url = '',
                stargazers_count = 56,
                stargazers_url = '',
                statuses_url = '',
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
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                url = '',
                visibility = '',
                watchers = 56,
                watchers_count = 56
            )
        else:
            return PullRequestHeadRepo(
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
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                default_branch = '',
                deployments_url = '',
                description = '',
                disabled = True,
                downloads_url = '',
                events_url = '',
                fork = True,
                forks = 56,
                forks_count = 56,
                forks_url = '',
                full_name = '',
                git_commits_url = '',
                git_refs_url = '',
                git_tags_url = '',
                git_url = '',
                has_discussions = True,
                has_downloads = True,
                has_issues = True,
                has_pages = True,
                has_projects = True,
                has_wiki = True,
                homepage = '',
                hooks_url = '',
                html_url = '',
                id = 56,
                issue_comment_url = '',
                issue_events_url = '',
                issues_url = '',
                keys_url = '',
                labels_url = '',
                language = '',
                languages_url = '',
                license = openapi_client.models.pull_request_head_repo_license.pull_request_head_repo_license(
                    key = '', 
                    name = '', 
                    node_id = '', 
                    spdx_id = '', 
                    url = '', ),
                merges_url = '',
                milestones_url = '',
                mirror_url = '',
                name = '',
                node_id = '',
                notifications_url = '',
                open_issues = 56,
                open_issues_count = 56,
                owner = openapi_client.models.pull_request_base_repo_owner.pull_request_base_repo_owner(
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
                    url = '', ),
                private = True,
                pulls_url = '',
                pushed_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                releases_url = '',
                size = 56,
                ssh_url = '',
                stargazers_count = 56,
                stargazers_url = '',
                statuses_url = '',
                subscribers_url = '',
                subscription_url = '',
                svn_url = '',
                tags_url = '',
                teams_url = '',
                trees_url = '',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                url = '',
                watchers = 56,
                watchers_count = 56,
        )
        """

    def testPullRequestHeadRepo(self):
        """Test PullRequestHeadRepo"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
