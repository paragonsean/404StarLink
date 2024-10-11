# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.commit_search_result_item_commit import CommitSearchResultItemCommit

class TestCommitSearchResultItemCommit(unittest.TestCase):
    """CommitSearchResultItemCommit unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CommitSearchResultItemCommit:
        """Test CommitSearchResultItemCommit
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CommitSearchResultItemCommit`
        """
        model = CommitSearchResultItemCommit()
        if include_optional:
            return CommitSearchResultItemCommit(
                author = openapi_client.models.commit_search_result_item_commit_author.commit_search_result_item_commit_author(
                    date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    email = '', 
                    name = '', ),
                comment_count = 56,
                committer = openapi_client.models.git_user.Git User(
                    date = '"2007-10-29T02:42:39.000-07:00"', 
                    email = '"chris@ozmm.org"', 
                    name = '"Chris Wanstrath"', ),
                message = '',
                tree = openapi_client.models.commit_search_result_item_commit_tree.commit_search_result_item_commit_tree(
                    sha = '', 
                    url = '', ),
                url = '',
                verification = openapi_client.models.verification.Verification(
                    payload = '', 
                    reason = '', 
                    signature = '', 
                    verified = True, )
            )
        else:
            return CommitSearchResultItemCommit(
                author = openapi_client.models.commit_search_result_item_commit_author.commit_search_result_item_commit_author(
                    date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    email = '', 
                    name = '', ),
                comment_count = 56,
                committer = openapi_client.models.git_user.Git User(
                    date = '"2007-10-29T02:42:39.000-07:00"', 
                    email = '"chris@ozmm.org"', 
                    name = '"Chris Wanstrath"', ),
                message = '',
                tree = openapi_client.models.commit_search_result_item_commit_tree.commit_search_result_item_commit_tree(
                    sha = '', 
                    url = '', ),
                url = '',
        )
        """

    def testCommitSearchResultItemCommit(self):
        """Test CommitSearchResultItemCommit"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
