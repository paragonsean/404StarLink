# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.git_commit import GitCommit

class TestGitCommit(unittest.TestCase):
    """GitCommit unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GitCommit:
        """Test GitCommit
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GitCommit`
        """
        model = GitCommit()
        if include_optional:
            return GitCommit(
                author = openapi_client.models.git_commit_author.git_commit_author(
                    date = '2014-08-09T08:02:04+12:00', 
                    email = 'monalisa.octocat@example.com', 
                    name = 'Monalisa Octocat', ),
                committer = openapi_client.models.git_commit_author.git_commit_author(
                    date = '2014-08-09T08:02:04+12:00', 
                    email = 'monalisa.octocat@example.com', 
                    name = 'Monalisa Octocat', ),
                html_url = '',
                message = 'Fix #42',
                node_id = '',
                parents = [
                    openapi_client.models.git_commit_parents_inner.git_commit_parents_inner(
                        html_url = '', 
                        sha = '7638417db6d59f3c431d3e1f261cc637155684cd', 
                        url = '', )
                    ],
                sha = '7638417db6d59f3c431d3e1f261cc637155684cd',
                tree = openapi_client.models.git_commit_tree.git_commit_tree(
                    sha = '7638417db6d59f3c431d3e1f261cc637155684cd', 
                    url = '', ),
                url = '',
                verification = openapi_client.models.git_commit_verification.git_commit_verification(
                    payload = '', 
                    reason = '', 
                    signature = '', 
                    verified = True, )
            )
        else:
            return GitCommit(
                author = openapi_client.models.git_commit_author.git_commit_author(
                    date = '2014-08-09T08:02:04+12:00', 
                    email = 'monalisa.octocat@example.com', 
                    name = 'Monalisa Octocat', ),
                committer = openapi_client.models.git_commit_author.git_commit_author(
                    date = '2014-08-09T08:02:04+12:00', 
                    email = 'monalisa.octocat@example.com', 
                    name = 'Monalisa Octocat', ),
                html_url = '',
                message = 'Fix #42',
                node_id = '',
                parents = [
                    openapi_client.models.git_commit_parents_inner.git_commit_parents_inner(
                        html_url = '', 
                        sha = '7638417db6d59f3c431d3e1f261cc637155684cd', 
                        url = '', )
                    ],
                sha = '7638417db6d59f3c431d3e1f261cc637155684cd',
                tree = openapi_client.models.git_commit_tree.git_commit_tree(
                    sha = '7638417db6d59f3c431d3e1f261cc637155684cd', 
                    url = '', ),
                url = '',
                verification = openapi_client.models.git_commit_verification.git_commit_verification(
                    payload = '', 
                    reason = '', 
                    signature = '', 
                    verified = True, ),
        )
        """

    def testGitCommit(self):
        """Test GitCommit"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
