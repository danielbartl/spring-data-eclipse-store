/*
 * Copyright © 2023 XDEV Software (https://xdev.software)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package software.xdev.spring.data.eclipse.store.integration.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CustomerRepository
	extends CrudRepository<Customer, String>, PagingAndSortingRepository<Customer, String>
{
	Optional<Customer> findByFirstName(String firstName);
	
	Iterable<Customer> findAllByLastName(String lastName);
	
	@Override
	Page<Customer> findAll(Pageable pageable);
	
	Page<Customer> findAllByLastName(String lastName, Pageable pageable);
	
	List<Customer> findByOrderByLastNameAsc();
	
	Iterable<Customer> findAllByLastName(String lastName, Sort sort);
	
	List<Customer> findAllByFirstName(String lastName, Pageable pageable);
}
