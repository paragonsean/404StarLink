# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.meta_api import MetaApi


class TestMetaApi(unittest.TestCase):
    """MetaApi unit test stubs"""

    def setUp(self) -> None:
        self.api = MetaApi()

    def tearDown(self) -> None:
        pass

    def test_meta_get(self) -> None:
        """Test case for meta_get

        Get GitHub Enterprise Server meta information
        """
        pass

    def test_meta_get_octocat(self) -> None:
        """Test case for meta_get_octocat

        Get Octocat
        """
        pass

    def test_meta_get_zen(self) -> None:
        """Test case for meta_get_zen

        Get the Zen of GitHub
        """
        pass

    def test_meta_root(self) -> None:
        """Test case for meta_root

        GitHub API Root
        """
        pass


if __name__ == '__main__':
    unittest.main()
