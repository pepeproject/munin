/*
 * Copyright (c) 2019. Globo.com - ATeam
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Authors: See AUTHORS file
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.globo.pepe.munin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@TestPropertySource(properties = {
    "pepe.keystone.url=default",
    "pepe.keystone.user=root",
    "pepe.keystone.password=",
    "pepe.keystone.domain=default",
    "pepe.keystone.project=pepe",
    "cors.allowed-origins=http://localhost",
    "cors.allowed-methods=GET,POST,DELETE,PATCH,PUT,HEAD,OPTIONS,TRACE,CONNECT"
})
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
