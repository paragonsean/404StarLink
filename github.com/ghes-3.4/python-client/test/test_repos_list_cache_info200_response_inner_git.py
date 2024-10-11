# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.repos_list_cache_info200_response_inner_git import ReposListCacheInfo200ResponseInnerGit

class TestReposListCacheInfo200ResponseInnerGit(unittest.TestCase):
    """ReposListCacheInfo200ResponseInnerGit unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ReposListCacheInfo200ResponseInnerGit:
        """Test ReposListCacheInfo200ResponseInnerGit
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ReposListCacheInfo200ResponseInnerGit`
        """
        model = ReposListCacheInfo200ResponseInnerGit()
        if include_optional:
            return ReposListCacheInfo200ResponseInnerGit(
                last_sync = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                sync_status = 'offline'
            )
        else:
            return ReposListCacheInfo200ResponseInnerGit(
                last_sync = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                sync_status = 'offline',
        )
        """

    def testReposListCacheInfo200ResponseInnerGit(self):
        """Test ReposListCacheInfo200ResponseInnerGit"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
