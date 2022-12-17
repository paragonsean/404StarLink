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

from openapi_client.models.list_worker_response import ListWorkerResponse

class TestListWorkerResponse(unittest.TestCase):
    """ListWorkerResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListWorkerResponse:
        """Test ListWorkerResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListWorkerResponse`
        """
        model = ListWorkerResponse()
        if include_optional:
            return ListWorkerResponse(
                meta = openapi_client.models.list_workspace_response_meta.ListWorkspaceResponse_meta(
                    first_page_url = '', 
                    key = '', 
                    next_page_url = '', 
                    page = 56, 
                    page_size = 56, 
                    previous_page_url = '', 
                    url = '', ),
                workers = [
                    openapi_client.models.taskrouter/v1/workspace/worker.taskrouter.v1.workspace.worker(
                        account_sid = 'AC62ECB020842930cc01FFCCfeEe150AC30123456789101112131415161718192021222324252627282930313233', 
                        activity_name = '', 
                        activity_sid = 'WA62ECB020842930cc01FFCCfeEe150AC30123456789101112131415161718192021222324252627282930313233', 
                        attributes = '', 
                        available = True, 
                        date_created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        date_status_changed = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        date_updated = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        friendly_name = '', 
                        links = openapi_client.models.links.links(), 
                        sid = 'WK62ECB020842930cc01FFCCfeEe150AC30123456789101112131415161718192021222324252627282930313233', 
                        url = '', 
                        workspace_sid = 'WS62ECB020842930cc01FFCCfeEe150AC30123456789101112131415161718192021222324252627282930313233', )
                    ]
            )
        else:
            return ListWorkerResponse(
        )
        """

    def testListWorkerResponse(self):
        """Test ListWorkerResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
