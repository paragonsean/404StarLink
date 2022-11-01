# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.pre_receive_hook_environment import PreReceiveHookEnvironment

class TestPreReceiveHookEnvironment(unittest.TestCase):
    """PreReceiveHookEnvironment unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PreReceiveHookEnvironment:
        """Test PreReceiveHookEnvironment
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PreReceiveHookEnvironment`
        """
        model = PreReceiveHookEnvironment()
        if include_optional:
            return PreReceiveHookEnvironment(
                created_at = '',
                default_environment = True,
                download = openapi_client.models.pre_receive_environment_download.pre_receive_environment_download(
                    downloaded_at = '', 
                    message = '', 
                    state = '', 
                    url = '', ),
                hooks_count = 56,
                html_url = '',
                id = 56,
                image_url = '',
                name = '',
                url = ''
            )
        else:
            return PreReceiveHookEnvironment(
        )
        """

    def testPreReceiveHookEnvironment(self):
        """Test PreReceiveHookEnvironment"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
