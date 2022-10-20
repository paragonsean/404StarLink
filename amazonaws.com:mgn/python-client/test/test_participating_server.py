# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.participating_server import ParticipatingServer

class TestParticipatingServer(unittest.TestCase):
    """ParticipatingServer unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ParticipatingServer:
        """Test ParticipatingServer
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ParticipatingServer`
        """
        model = ParticipatingServer()
        if include_optional:
            return ParticipatingServer(
                launch_status = None,
                launched_ec2_instance_id = None,
                post_launch_actions_status = None,
                source_server_id = None
            )
        else:
            return ParticipatingServer(
                source_server_id = None,
        )
        """

    def testParticipatingServer(self):
        """Test ParticipatingServer"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
