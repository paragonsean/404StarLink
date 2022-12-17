# coding: utf-8

"""
    Twilio - Taskrouter

    This is the public Twilio REST API.

    The version of the OpenAPI document: 1.42.0
    Contact: support@twilio.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.list_task_queue_response import ListTaskQueueResponse

class TestListTaskQueueResponse(unittest.TestCase):
    """ListTaskQueueResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListTaskQueueResponse:
        """Test ListTaskQueueResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListTaskQueueResponse`
        """
        model = ListTaskQueueResponse()
        if include_optional:
            return ListTaskQueueResponse(
                meta = openapi_client.models.list_workspace_response_meta.ListWorkspaceResponse_meta(
                    first_page_url = '', 
                    key = '', 
                    next_page_url = '', 
                    page = 56, 
                    page_size = 56, 
                    previous_page_url = '', 
                    url = '', ),
                task_queues = [
                    openapi_client.models.taskrouter/v1/workspace/task_queue.taskrouter.v1.workspace.task_queue(
                        account_sid = 'AC62ECB020842930cc01FFCCfeEe150AC30123456789101112131415161718192021222324252627282930313233', 
                        assignment_activity_name = '', 
                        assignment_activity_sid = 'WA62ECB020842930cc01FFCCfeEe150AC30123456789101112131415161718192021222324252627282930313233', 
                        date_created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        date_updated = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        friendly_name = '', 
                        links = openapi_client.models.links.links(), 
                        max_reserved_workers = 56, 
                        reservation_activity_name = '', 
                        reservation_activity_sid = 'WA62ECB020842930cc01FFCCfeEe150AC30123456789101112131415161718192021222324252627282930313233', 
                        sid = 'WQ62ECB020842930cc01FFCCfeEe150AC30123456789101112131415161718192021222324252627282930313233', 
                        target_workers = '', 
                        task_order = 'FIFO', 
                        url = '', 
                        workspace_sid = 'WS62ECB020842930cc01FFCCfeEe150AC30123456789101112131415161718192021222324252627282930313233', )
                    ]
            )
        else:
            return ListTaskQueueResponse(
        )
        """

    def testListTaskQueueResponse(self):
        """Test ListTaskQueueResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
